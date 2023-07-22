package Classes;

import Interface.Vote;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Post implements Vote {
    public int id;
    public String title;
    public String body;
    public List<Comment> comments;
    public LocalDateTime postedAt;
    public User postedBy;
    public int upVote;
    public int downVote;

    public Post(){
        this.comments = new ArrayList<>();
    }
    @Override
    public void upVote() {
        this.upVote++;
    }

    @Override
    public void downVote() {
        this.downVote++;
    }

    public void addComments(Comment comment){
        this.comments.add(comment);
    }
    public long getDisplayTime(){
        return Duration.between(LocalDateTime.now(),this.postedAt).toMinutes();
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                ", comments=" + comments +
                ", postedAt=" + postedAt +
                ", postedBy=" + postedBy +
                ", upVote=" + upVote +
                ", downVote=" + downVote +
                '}';
    }
}
