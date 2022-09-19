package RegisterSystem;

public class user {
    private String name;
    private String password;
    private String identifyNumber;
    private String phoneNumber;

    public user() {
    }

    public user(String name, String password, String identifyNumber, String phoneNumber) {
        this.name = name;
        this.password = password;
        this.identifyNumber = identifyNumber;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIdentifyNumber() {
        return identifyNumber;
    }

    public void setIdentifyNumber(String identifyNumber) {
        this.identifyNumber = identifyNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
