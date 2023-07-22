package Classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserController {
    Map<Integer,User> map;
    private static UserController instance;
    List<User> users;
    private UserController(){
        this.map = new HashMap<>();
        this.users = new ArrayList<>();
    }

    public static UserController getInstance(){
        if(instance == null){
            synchronized (Class.class) {
                if (instance == null) {
                    instance = new UserController();
                }
            }
        }
        return instance;
    }

    public User getUserByUsername(String username){
        for(User user : users){
            if(user.username.equals(username)){
                return  user;
            }
        }
        return null;
    }

    public User getUserById(int id){
        return map.get(id);
    }

    public void addUser(User user){
        map.put(user.id,user);
        users.add(user);
    }
}
