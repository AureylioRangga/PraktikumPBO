package backend;

import java.sql.*;
import java.util.ArrayList;

public class MemberController {

    // INSERT
    public static boolean tambah(Member m) {
        String sql = "INSERT INTO anggota (nama, alamat, no_hp, email, jenis_member, tanggal_daftar, status) "
                   + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = KoneksiDB.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, m.getNama());
            ps.setString(2, m.getAlamat());
            ps.setString(3, m.getNoHp());
            ps.setString(4, m.getEmail());
            ps.setString(5, m.getJenisMember());
            ps.setDate(6, Date.valueOf(m.getTanggalDaftar()));
            ps.setString(7, m.getStatus());
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
                        rs.getString("email"),
                        rs.getString("jenis_member"),
                        rs.getString("tanggal_daftar"),
                        rs.getString("status")
                ));
            }

        } catch (Exception e) {
            System.out.println("Error tampil: " + e.getMessage());
        }
        return list;
    }

    // UPDATE
    public static boolean update(Member m) {
        String sql = "UPDATE anggota SET nama=?, alamat=?, no_hp=?, email=?, jenis_member=?, "
                   + "tanggal_daftar=?, status=? WHERE id=?";
        try (Connection conn = KoneksiDB.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, m.getNama());
            ps.setString(2, m.getAlamat());
            ps.setString(3, m.getNoHp());
            ps.setString(4, m.getEmail());
            ps.setString(5, m.getJenisMember());
            ps.setDate(6, Date.valueOf(m.getTanggalDaftar()));
            ps.setString(7, m.getStatus());
            ps.setInt(8, m.getId());
            ps.executeUpdate();
            return true;

        } catch (Exception e) {
            System.out.println("Error update: " + e.getMessage());
            return false;
        }
    }

    // DELETE (tidak berubah: tetap berdasarkan id)
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
