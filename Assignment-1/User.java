class Comment {
    private String name;
    private String comment;

    public Comment(String name, String comment) {
        this.name = name;
        this.comment = comment;
    }

    public String getComment() {
        return comment;
    }

    public String getName() {
        return name;
    }
}

class Post {
    private String userName;
    private String postContent;
    private Comment[] comments;
    private int numComments;

    public Post(String userName, String postContent) {
        this.userName = userName;
        this.postContent = postContent;
        this.comments = new Comment[10];
        this.numComments = 0;
    }

    public void addComment(String user, String comment) {
        comments[numComments] = new Comment(user, comment);
        numComments++;
    }

    public void displayPost() {
        System.out.println(this.userName + " posted: " + postContent);
    }

    public void displayComments() {
        System.out.println("--------------Comments--------------");
        for (int i = 0; i < numComments; i++) {
            System.out.println(comments[i].getName() + ": " + comments[i].getComment());
        }
    }
}

class User {
    private String username;
    private Post post;

    public User(String username) {
        this.username = username;
    }

    public void createPost(String postContent) {
        this.post = new Post(this.username, postContent);
    }

    public void displayPost() {
        post.displayPost();
    }

    public void displayComments() {
        post.displayComments();
    }

    public Post getPost()
    {
        return this.post;
    }
    public static void main(String[] args) {
        User user1 = new User("John");
        user1.createPost("Hello World!");
        user1.displayPost();
        user1.getPost().addComment("Doe", "Hi John");
        user1.getPost().addComment("Susan", "Good morning John");
        user1.displayComments();
    }

}
