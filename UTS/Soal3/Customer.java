package UTS.Soal3;

public class Customer extends User {
    private boolean verificationStatus = false;

    public Customer(int userId, String password, String name, int age, String emailId) {
        super(userId, password, name, age, emailId);
    }

    public boolean getVerificationStatus() { return verificationStatus; }

    void setVerificationStatus(boolean status) { this.verificationStatus = status; }

    public void applyVerification(String doc) {
        if (getProfile().setDoc(doc)) {
            System.out.println(getProfile().getName() + " mengajukan verifikasi dengan dokumen " + doc);
        } else {
            System.out.println("Format dokumen tidak valid. Gunakan .jpg, .png, atau .pdf");
        }
    }
}