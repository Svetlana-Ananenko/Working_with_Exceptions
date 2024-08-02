public class Information {


    private String login;
    private String password;
    private String confirmPassword;


    public Information(String login, String password, String confirmPassword) {
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }


    public String getLogin() {
        return this.login;
    }

    public String getPassword() {
        return this.password;
    }

    public String getConfirmPassword() {
        return this.confirmPassword;
    }


    public String setLogin(String login) {
        return this.login;
    }

    public String setPassword(String password) {
        return this.password;
    }

    public String setConfirmPassword(String confirmPassword) {
        return this.confirmPassword;
    }
}