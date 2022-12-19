package dataGenerator;

public class RegistrationData {


    private String email;
    private String password;
    private String firstName;


    public RegistrationData(){

    }
    public RegistrationData(String email, String password, String firstName){
        this.email = email;
        this.password = password;
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public static RegistrationData generateUser(){
        RegistrationData randomUser = new RegistrationData();
        randomUser.setEmail(DataCreation.generateEmail());
        randomUser.setPassword(DataCreation.generatePassword());
        randomUser.setFirstName(DataCreation.generateFirstName());
        return randomUser;
    }
}
