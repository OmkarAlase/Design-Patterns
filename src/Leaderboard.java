public class Leaderboard {
    private static Leaderboard instance;

    private Leaderboard(){

    }
    //Double check Locking - DCL
    public static Leaderboard getInstance(){
        if(instance == null){
            synchronized (Leaderboard.class){
                if(instance == null){
                    instance = new Leaderboard();
                }
            }
        }

        return instance;
    }

}
