# Modul-Poly-Practise
A small task given to us by the teacher to solve some problems


## Erster Auftrag
Nun der erste auftrag ist sehr einfach: <br>
Hier mussten wir einfach einen neuen Post hinzufügen. Dieser Post Klasse hatte den Namen EventPost. <br>
Nun schnell nach dem hinzufügen wurde bemerkbar, dass es sehr aufwändig ist, diese neue Klasse hinzuzufügen. Auch weil die neue Klasse praktisch einfach ein Copy Paste von den anderen Klassen ist.<br>
Beispielsweise muss man die ```NewsFeed``` Klasse stark bearbeiten, dass man diese Klasse hinzufügen kann. <br> 
Ich möche nun den Code Abschnitt zitieren. Hier werden schnell verschiedene Beispiele sichtbar. 
```java
import java.util.ArrayList;

public class NewsFeed {
	
	
	private ArrayList<MessagePost> messages;
	private ArrayList<PhotoPost> photos;
	private ArrayList<EventPost> events;
	
	public NewsFeed() {
		events = new ArrayList<>();
		messages = new ArrayList<>();
		photos = new ArrayList<>();
	}
	
	
	public void addMessagePost(MessagePost message) {
		messages.add(message);
	}
	
	public void addPhotoPost(PhotoPost photo) {
		photos.add(photo);
	}

	public void addEventPost(EventPost event)
	{
		events.add(event);
	}

	public void show() {
		
		for(MessagePost message : messages) {
			message.display();
			System.out.println();
		}
		
		for(PhotoPost photo : photos) {
			photo.display();
			System.out.println();
		}

		for(EventPost event : events) {
			event.display();
			System.out.println();
		}
	}

}
```
Hier können wir sehr schnell sehen, dass in diesem Codeabschnitt drei verschiedene ```ArrayList``` Objekte erstellt werden. Dies ist sehr unschön, da es sehr redundant ist. Ebenfalls muss man in deisem Beispiel auch drei For Loops von der quasi gleichen Liste.<br>
Generell ist der ganze Code sehr redundant. Beispielsweise hat fast jede Klasse eine ```timeString``` Methode. Dies hätte man auch ganz einfach mit wenigstens einer static Methode auf einer anderen Klasse machen können. <br><br>
Generell würde ich dem Autor empfehlen, dass er den code komplett neuschreiben sollte. Diesmal mit [Polymorphism](https://www.techtarget.com/whatis/definition/polymorphism) im Sinne. <br>
So könnte er beispielsweise einfach eine Post Klasse erstellen und dann einfach die Message, Event und Photo Klasse einfach mit der Post Klasse extenden.
<br><br>
Ebenfalls stimmt es, dass man anstatt ein ```ArrayList<String>``` lieber ein ```ArrayList<Comment>``` benutzten sollte. Das setzt aber voraus, dass eine Comment Klasse vorhanden sein muss. <br>
Dies hat mehrere Vorteile. Zum Beispiel, dass man Attribute wie Author, Message, CreationDate oder UpdateDate zu dem Comment hinzufügen kann. Dies macht dann die ganze App sehr viel mehr Scaleable.<br>
