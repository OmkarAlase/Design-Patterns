package Classes;

import Interface.Vote;

import java.util.ArrayList;
import java.util.List;

public class Comment implements Vote {
    public int id;
    public String comment;
    public List<Comment> comments;

    public Comment(){
        this.comments = new ArrayList<>();
    }
    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", comment='" + comment + '\'' +
                ", postId=" + postId +
                ", upVote=" + upVote +
                ", downVote=" + downVote +
                ", comments=" + comments +
                '}';
    }

    public int postId;
    int upVote;
    int downVote;
    @Override
    public void upVote() {
        this.upVote++;
    }

    @Override
    public void downVote() {
        this.downVote++;
    }

    public void addComment(Comment comment){
        this.comments.add(comment);
    }
}
