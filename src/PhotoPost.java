import java.util.ArrayList;

/**
 * This class represents photo posts.
 * It is currently only a prototype but could be extended to show photos.
 * 
 * @author based on ObjectsFirst book
 *
 */

public class PhotoPost extends Post {

	private String filename;
	private String caption;

	/**
	 * Constructor for objects of class PhotoPost
	 * @param filename The name and full Path of the posted Photo
	 * @param caption Caption of the photo
	 */
	public PhotoPost(String author, String filename, String caption) {
		super(author);
		this.filename = filename;
		this.caption = caption;
	}

	public String getCaption() {
		return caption;
	}

	public String getImageFile() {
		return filename;
	}
	
	/**
	 * Simulate display for the time being
	 */
	public void display() {
		super.display();
		System.out.println("FileName " + "{" + filename + "}");
		System.out.println("Caption " + caption);
	}
}
