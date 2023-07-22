package Classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserPostController {
    public Map<Integer, List<Post>> map;
    private static UserPostController instance;

    private UserPostController(){
        this.map = new HashMap<>();
    }

    public static UserPostController getInstance(){
        if(instance == null){
            synchronized (UserPostController.class){
                if(instance == null){
                    instance = new UserPostController();
                }
            }
        }

        return instance;
    }

    public List<Post> getPostsByUserId(int id){
        return map.get(id);
    }

    public void addPost(int id,Post post){
        map.putIfAbsent(id,new ArrayList<>());
        map.get(id).add(post);
    }
}
