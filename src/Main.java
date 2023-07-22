import Classes.*;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        // Sign-up & login using same credentials.
        Signup signup = new GoogleSignup(UserController.getInstance());
        SignupAdapter signupAdapter = new SignupAdapter(signup);
        signupAdapter.signUp("omkar","omkar");
        signupAdapter.signUp("ajay","ajay");
        Login login = new GoogleLogin(UserController.getInstance());
        LoginAdapter loginAdapter = new LoginAdapter(login);
        System.out.println(loginAdapter.logIn("omkar","omkar"));



        // Create Post.
        User user = UserController.getInstance().getUserByUsername("omkar");
        Post post = new Post();
        post.id = 1;
        post.postedBy = user;
        post.postedAt = LocalDateTime.now();
        post.title = "ChatGPT AI Chat Bot";
        post.body = "ChatGPT AI Chat Bot";



        Post post2 = new Post();
        post2.id = 2;
        post2.postedBy = user;
        post2.postedAt = LocalDateTime.now();
        post2.title = "AI System";
        post2.body = "AI System";


        // Publish Post.
        UserPostController.getInstance().addPost(user.id,post);
        UserPostController.getInstance().addPost(user.id,post2);
        // Up-vote & down-vote post.
        post.upVote();
        post.upVote();
        post.downVote();

        // User following other users
        User followTo = UserController.getInstance().getUserByUsername("ajay");
        user.followUser(followTo);

        // User can comment on posts;
        Comment comment = new Comment();
        comment.id = 1;
        comment.comment = "Great share.";
        comment.postId = post.id;
        post.addComments(comment);

        // User can comment on others comment
        Comment comment1 = new Comment();
        comment1.id = 2;
        comment1.comment = "Awesome share.";
        comment.addComment(comment1);

        // upvote & down-vote comments
        comment.upVote();
        comment.upVote();
        comment.downVote();

        comment1.upVote();
        comment1.downVote();

        // Any user can read his news feed. News items are sorted based on conditions.
        ShowFeed feed = ShowFeed.getInstance();
        System.out.println(feed.getPostsByUserId(user.id));

    }
}