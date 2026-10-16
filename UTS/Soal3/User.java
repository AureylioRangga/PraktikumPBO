package UTS.Soal3;

public class User {
    private final UserProfile profile;

    public User(int userId, String password, String name, int age, String emailId) {
        this.profile = new UserProfile(userId, password, name, age, emailId);
    }

    public UserProfile getProfile() { return profile; }

    public boolean logIn(int userId, String password) {
        boolean berhasil = profile.getUserId() == userId && profile.getPassword().equals(password);
        System.out.println(berhasil ? profile.getName() + " berhasil log in."
                                    : "Log in gagal: user_id atau password salah.");
        return berhasil;
    }

    public void recoverPassword() {
        System.out.println("Tautan pemulihan password dikirim ke " + profile.getEmail());
    }

    public void logOut() {
        System.out.println(profile.getName() + " telah log out.");
    }
}
