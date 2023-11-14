
public class Starter {

	public static void main(String[] args) {
		
		
		NewsFeed news = new NewsFeed();
		
		MessagePost post1 = new MessagePost("john", "Had a great day up in Zermatt!");
		post1.like();
		post1.like();

		post1.addComment(new Comment("daniel", "this is sick"));
		post1.addComment(new Comment("lorin", "bestes projekt!!!"));
		post1.addComment(new Comment("robin", "Das ist soo cool"));

		news.addPost(post1);
		news.show();
	}

}
