/**
 * This class is to store and process (add a new book, delete a book
 * search for a book, sort the books in the database etc.) 
 * the books in the database. 
 */

public class BookManager {
    private Book[] books;  
    private int bookCount;   
    private int capacity; 

    // Constructor
    public BookManager(int capacity) {
        this.books  = new Book[capacity]; 
        this.capacity = capacity; 
        this.bookCount = 0; 
    }


    public int getBookCount() {
        return this.bookCount;
    }
    

    public Book[] getBooks() {
        return books; 
    }

    /**
     * This method adds a new book to the array. 
     * 	0: if another recipe with the same id exists
     * 	1: if the new recipe has been successfully added
     * 	2: if there is no available space in the array
     */
    public int addBook(Book book) {
        // Check if array is full
        if (bookCount >= capacity) {
            return 2;
        }
        
        // Check if book with same ID already exists
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getId().equals(book.getId())) {
                return 0;
            }
        }
        
        // Add the book
        books[bookCount] = book;
        bookCount++;
        return 1;
    }

    /**
     * This method deletes the book with the given id. 
     * true: if the book has been successfully deleted.
     * 	false: if the book has not been found.  
     */
    public boolean deleteBook(String id) {
        // Find the book with the given ID
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getId().equals(id)) {
                // Shift all books after this one to the left
                for (int j = i; j < bookCount - 1; j++) {
                    books[j] = books[j + 1];
                }
                books[bookCount - 1] = null; // Clear the last position
                bookCount--;
                return true;
            }
        }
        return false;
    }
    
    /**
     * This method searches for a book with the given term (id or title)
     * 	book[]: a list of books matching the search criteria is returned
     * 	null: if no recipe is found.
     */
    public Book[] searchBooks(String searchTerm) {
        // First, count how many books match
        int matchCount = 0;
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getId().equalsIgnoreCase(searchTerm) || 
                books[i].getTitle().toLowerCase().contains(searchTerm.toLowerCase())) {
                matchCount++;
            }
        }
        
        // If no matches, return null
        if (matchCount == 0) {
            return null;
        }
        
        // Create array for results and populate it
        Book[] results = new Book[matchCount];
        int index = 0;
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getId().equalsIgnoreCase(searchTerm) || 
                books[i].getTitle().toLowerCase().contains(searchTerm.toLowerCase())) {
                results[index] = books[i];
                index++;
            }
        }
        
        return results;
    }
    
    /**
     * This method sorts the recipes in ascending alphabetical order
     * based on the recipe name.
     */
    public void sortBooks() {
        // Bubble sort based on title
        for (int i = 0; i < bookCount - 1; i++) {
            for (int j = 0; j < bookCount - i - 1; j++) {
                if (books[j].getTitle().compareToIgnoreCase(books[j + 1].getTitle()) > 0) {
                    // Swap books[j] and books[j+1]
                    Book temp = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = temp;
                }
            }
        }
    }
}
