package backend;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class MemberController {

    public static boolean simpanMember(MemberGym member) {
        try {
            Connection conn = TestKoneksi.getConnection();

            if (conn == null) {
                System.out.println("Koneksi null! Tidak bisa menyimpan.");
                return false;
            }

            String sql = "INSERT INTO member_gym (nama, usia, paket) VALUES (?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, member.getNama());
            stmt.setInt(2, member.getUsia());
            stmt.setString(3, member.getPaket());

            stmt.executeUpdate();
            stmt.close();
            conn.close();
            return true;

        } catch (Exception e) {
            System.out.println("Gagal simpan: " + e.getMessage());
            return false;
        }
    }
}

