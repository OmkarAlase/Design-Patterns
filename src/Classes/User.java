package Classes;

import java.util.ArrayList;
import java.util.List;

public class User {
    public int id;
    String name;
    int age;
    String email;
    String username;
    String password;
    String gender;
    List<User> followers;
    List<User> following;

    public User(){
        this.following = new ArrayList<>();
        this.followers = new ArrayList<>();
    }
    public List<User> getFollowers(){
        return this.followers;
    }

    public List<User> getFollowing(){
        return this.following;
    }

    public void followUser(User user){
        this.following.add(user);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", gender='" + gender + '\'' +
                ", followers=" + followers +
                ", following=" + following +
                '}';
    }

    public void unFollowUser(User user){
        if(this.following.contains(user)){
            this.following.remove(user);
        }
    }
}
