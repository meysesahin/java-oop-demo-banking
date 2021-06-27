public class AccountOwner {
    private String name;
    private String identificationNumber;
    private String phoneNumber;

    public AccountOwner(String name, String identificationNumber, String phoneNumber) {
        this.name = name;
        this.identificationNumber = identificationNumber;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Ad Soyad: " + name + "\n" +
                "Kimlik No: " + identificationNumber + "\n" +
                "Tel No: " + phoneNumber + "\n";
    }
}