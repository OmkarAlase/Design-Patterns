package Classes;

public abstract  class Login {
    public UserController userController;
    public Login(UserController userController){
        this.userController = userController;
    }
    public abstract String logIn(String username,String password);
}
