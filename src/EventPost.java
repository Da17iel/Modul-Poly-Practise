import java.util.ArrayList;

public class EventPost {
    private String author;
    private long timeStamp;
    private int pages;
    private int likes;
    private ArrayList<String> comments;

    public EventPost(String author, long timeStamp, int pages, int likes, ArrayList<String> comments) {
        this.author = author;
        this.timeStamp = timeStamp;
        this.pages = pages;
        this.likes = likes;
        this.comments = comments;
    }

    public void like() {
        likes++;
    }


    public void unlike() {
        if (likes > 0){
            likes--;
        }
    }

    public void addComment(String text) {
        comments.add(text);
    }


    public String getAuthor() {
        return author;
    }


    public long getTimeStamp() {
        return timeStamp;
    }

    public long getPages() {
        return pages;
    }

    public long getLikes() {
        return likes;
    }

    /**
     * Simulate display for the time being
     */
    public void display() {

        System.out.println("Author " + author);
        System.out.println("TimeStamp " + timeStamp);
        System.out.println("Pages " + pages);
        System.out.println("Posted " + timeString());

        if (likes > 0) {
            System.out.println(likes + " people like this.");
        } else {
            System.out.println();
        }
        if (comments.isEmpty()) {
            System.out.println("No Comments yet...");

        } else {
            System.out.println("   " + comments.size() + " comment(s). Press C to view");
        }
    }



    private String timeString() {

        long current = System.currentTimeMillis();
        long pastMillis = current - timeStamp;
        long seconds = pastMillis/1000;
        long minutes = seconds/60;
        long hours = minutes/60;
        if (minutes > 0) {
            return minutes + " minutes ago";
        } else if(hours > 0){
            return hours + " hours ago";
        } else {
            return seconds + " seconds ago";
        }

    }
}
