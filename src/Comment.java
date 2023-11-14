/**
 * Class for comments
 */
public class Comment extends Post{
    private String content;

    /**
     * Constructor for the comment class
     * @param username username of the person that makes the comment
     * @param content content of the inside of the comment
     */
    public Comment(String username, String content) {
        super(username);
        this.content = content;
    }

    /**
     * Sets content of the Comment
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * gets the content of the current Comment
     * @return the content of the Comment
     */
    public String getContent() {
        return this.content;
    }
}
