package Classes;


import java.util.List;
import java.util.stream.Collectors;

public class ShowFeed {
    private UserPostController userPostController;

    private static ShowFeed instance;
    private ShowFeed(UserPostController userPostController){
        this.userPostController = userPostController;
    }

    public static ShowFeed getInstance(){
        if(instance == null){
            synchronized (ShowFeed.class){
                if(instance == null){
                    instance = new ShowFeed(UserPostController.getInstance());
                }
            }
        }

        return instance;
    }
    public List<Post> getPostsByUserId(int id){
        return this.userPostController.getPostsByUserId(id).stream().sorted((a,b)->{
            return b.upVote - a.upVote;
        }).sorted((a,b)->{
            return b.comments.size() - a.comments.size();
        }).sorted((a,b)->{
            return a.getDisplayTime() > b.getDisplayTime() ? -1 : 1;
        }).collect(Collectors.toList());
    }
}
