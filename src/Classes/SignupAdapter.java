package Classes;

public class SignupAdapter {
    Signup signUp;
    public SignupAdapter(Signup signup) {
        this.signUp = signup;
    }

    public void signUp(String username,String password){
        this.signUp.signUp(username,password);
    }
}
