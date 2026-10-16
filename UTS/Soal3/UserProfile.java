package UTS.Soal3;

public class UserProfile {
    private int userId;
    private String password;
    private String name;
    private int age;
    private String emailId;
    private String doc;   

    public UserProfile(int userId, String password, String name, int age, String emailId) {
        this.userId = userId;
        this.password = password;
        this.name = name;
        this.age = age;
        this.emailId = emailId;
    }

    public int getUserId() { 
        return userId; 
    }
    public String getPassword() { 
        return password; 
    }
    public String getName(){ 
        return name; 
    }
    public int getAge() { 
        return age; 
    }
    public String getEmail() { 
        return emailId; 
    }
    public String getDoc() { 
        return doc; 
    }

    public static boolean isValidDoc(String fileName) {
        String f = fileName.toLowerCase();
        return f.endsWith(".jpg") || f.endsWith(".png") || f.endsWith(".pdf");
    }

    public boolean setDoc(String fileName) {
        if (isValidDoc(fileName)) {
            this.doc = fileName;
            return true;
        }
        return false;
    }

    public void editProfile(String name, int age, String emailId) {
        this.name = name;
        this.age = age;
        this.emailId = emailId;
        System.out.println("Profil berhasil diperbarui.");
    }

    public void showDocuments() {
        System.out.println("Dokumen: " + (doc == null ? "(belum ada dokumen)" : doc));
    }
}
