// Base class
class Book {
    public String ISBN;              // public
    protected String title;          // protected
    private String author;           // private

    Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Public methods to access private author
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void display() {
        System.out.println("ISBN: " + ISBN + ", Title: " + title + ", Author: " + author);
    }
}

// Subclass to demonstrate access
class EBook extends Book {
    double fileSize;

    EBook(String ISBN, String title, String author, double fileSize) {
        super(ISBN, title, author);
        this.fileSize = fileSize;
    }

    void displayEBookDetails() {
        // Can access public ISBN and protected title
        System.out.println("E-Book ISBN: " + ISBN + ", Title: " + title + ", File Size: " + fileSize + "MB");
    }
}
