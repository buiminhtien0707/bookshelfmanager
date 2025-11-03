/**
 * 
 * This class is to be completed.
 *
 */
public class Book {
    private String id;
    private String title;
    private String author;
    private String notes;

    // Constructor
    public Book(String id, String title, String author, String notes) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.notes = notes;
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getNotes() {
        return notes;
    }

    // Setters
    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
