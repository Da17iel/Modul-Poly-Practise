import java.util.ArrayList;

public class EventPost extends Post {
    private int pages;

    public EventPost(String author, int pages) {
        super(author);
        this.pages = pages;
    }

    public long getPages() {
        return pages;
    }

    /**
     * Simulate display for the time being
     */
    public void display() {
        super.display();
        System.out.println("Pages " + pages);
    }
}
