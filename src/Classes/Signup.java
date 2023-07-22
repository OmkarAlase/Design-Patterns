package Classes;

public abstract class Signup {
    UserController userController;
    public Signup(UserController userController){
        this.userController = userController;
    }
    public abstract void signUp(String username,String password);
}
