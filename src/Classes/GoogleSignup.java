package Classes;

public class GoogleSignup extends Signup {
    UserController userController;
    public GoogleSignup(UserController userController){
        super(userController);
        this.userController = userController;
    }
    @Override
    public void signUp(String username, String password) {
        User user = new User();
        user.id = userController.users.size() + 1;
        user.username = username;
        user.password = password;
        userController.addUser(user);

    }
}
