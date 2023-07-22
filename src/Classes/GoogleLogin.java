package Classes;

public class GoogleLogin extends Login {
    UserController userController;

    public GoogleLogin(UserController userController){
        super(userController);
        this.userController = userController;
    }
    @Override
    public String logIn(String username, String password) {
        System.out.println("Login Using Google Login.");
        User dbUser = userController.getUserByUsername(username);
        if(dbUser.username.equals(username) && dbUser.password.equals(password)){
            return "Success";
        }
        return "In valid Username or Password";
    }
}
