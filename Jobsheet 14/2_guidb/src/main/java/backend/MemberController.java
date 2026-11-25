package backend;

import java.sql.*;
import java.util.ArrayList;

public class MemberController {

    // INSERT
    public static boolean tambah(Member m) {
        String sql = "INSERT INTO anggota (nama, alamat, no_hp, jenis_member) VALUES (?, ?, ?, ?)";
        try (Connection conn = KoneksiDB.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, m.getNama());
            ps.setString(2, m.getAlamat());
            ps.setString(3, m.getNoHp());
            ps.setString(4, m.getJenisMember());
            ps.executeUpdate();
            return true;

        } catch (Exception e) {
            System.out.println("Error tambah: " + e.getMessage());
            return false;
        }
    }

    // SELECT ALL
    public static ArrayList<Member> getAll() {
        ArrayList<Member> list = new ArrayList<>();
        String sql = "SELECT * FROM anggota";
        try (Connection conn = KoneksiDB.getConnection(); Statement st = conn.createStatement(); ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                list.add(new Member(
                        rs.getInt("id"),
                        rs.getString("nama"),
                        rs.getString("alamat"),
                        rs.getString("no_hp"),
                        rs.getString("jenis_member")
                ));
            }

        } catch (Exception e) {
            System.out.println("Error tampil: " + e.getMessage());
        }
        return list;
    }

    // UPDATE
    public static boolean update(Member m) {
        String sql = "UPDATE anggota SET nama=?, alamat=?, no_hp=?, jenis_member=? WHERE id=?";
        try (Connection conn = KoneksiDB.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, m.getNama());
            ps.setString(2, m.getAlamat());
            ps.setString(3, m.getNoHp());
            ps.setString(4, m.getJenisMember());
            ps.setInt(5, m.getId());
            ps.executeUpdate();
            return true;

        } catch (Exception e) {
            System.out.println("Error update: " + e.getMessage());
            return false;
        }
    }

    // DELETE
    public static boolean delete(int id) {
        String sql = "DELETE FROM anggota WHERE id=?";
        try (Connection conn = KoneksiDB.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.executeUpdate();
            return true;

        } catch (Exception e) {
            System.out.println("Error delete: " + e.getMessage());
            return false;
        }
    }
}
