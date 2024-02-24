class Post{
	public void publish() {
		System.out.println("Post published");
	}
}

class TextPost extends Post{
	int wordCount = 100;
	public void publish() {
		System.out.println("Post published. Word Count: "+wordCount);
	}
}

class ImagePost extends Post{
	int pixels = 100;
	public void publish() {
		System.out.println("Post published. Pixels: "+ pixels);
	}
}

class VideoPost extends Post{
	int videoLength = 120;
	public void publish() {
		System.out.println("Post published. Length of video: "+ videoLength);
	}
}

public class PostOffice {
    public static void main(String[] args) {
    	
        Post genericPost = new Post();
        TextPost textPost = new TextPost();
        ImagePost imagePost = new ImagePost();
        VideoPost videoPost = new VideoPost();

        genericPost.publish();
        textPost.publish();
        imagePost.publish();
        videoPost.publish();
    }
}
