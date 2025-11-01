/**
 * This class is to store and process (add a new book, delete a book
 * search for a book, sort the books in the database etc.) 
 * the books in the database. 
 * You should fill in the method bodies given below.
 * If necessary, you can add any other helper methods. 
 */

public class BookManager {
    private Book[] books;  // Array to hold recipes
    private int bookCount;   // Counter to track the number of recipes
    private int capacity; 

    // Constructor
    public BookManager(int capacity) {
        this.books  = new Book[capacity];  // Initialize array with a given capacity
        this.capacity = capacity; 
        this.bookCount = 0;  // No recipes initially
    }

    /**
     * It returns the number of books in the database. 
     * @return bookCount
     */
    public int getBookCount() {
    	return this.bookCount;
    }
    
    /**
     * It returns the array of books
     * @return books
     */
    public Book[] getBooks() {
    	return books; 
    }

    /**
     * This method adds a new book to the array. 
     * @param recipe
     * @return 	0: if another recipe with the same id exists
     * 			1: if the new recipe has been successfully added
     * 			2: if there is no available space in the array
     */
    public int addBook(Book book) {
    	
    }

    /**
     * This method deletes the book with the given id. 
     * @param book id
     * @return 	true: if the book has been successfully deleted.
     * 			false: if the book has not been found.  
     */
    public boolean deleteBook(String id) {
        
    }
    
    /**
     * This method searches for a book with the given term (id or name)
     * @param searchTerm (id or name)
     * @return 	book[]: a list of books matching the search criteria is returned
     * 			null: if no recipe is found.
     */
    public Book[] searchBooks(String searchTerm) {
    	
    }
    
    /**
     * This method sorts the recipes in ascending alphabetical order
     * based on the recipe name.
     */
    public void sortBooks() {
    	
    }
}
