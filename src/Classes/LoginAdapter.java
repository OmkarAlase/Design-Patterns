package Classes;

public class LoginAdapter {
    Login loginMethod;
    public LoginAdapter(Login login) {
        this.loginMethod = login;
    }
    public String logIn(String username,String password){
        return this.loginMethod.logIn(username,password);
    }
}
