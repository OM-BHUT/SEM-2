public class Q2 {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Usage: java Q2 <author_name> <book_publication_title> <paper_publication_title>");
            return;
        }

        String authorName = args[0];
        String bookTitle = args[1];
        String paperTitle = args[2];

        Book a = new Book(authorName);
        a.displayAuthorName();

        Book b1 = new Book_publication(authorName, bookTitle);
        b1.displayTitle();

        Book b2 = new Paper_publication(authorName, paperTitle);
        b2.displayTitle();
    }
}

class Book {
    private String authorName;

    public Book(String authorName) {
        this.authorName = authorName;
    }

    public void displayAuthorName() {
        System.out.println("Author Name: " + authorName);
    }

    public void displayTitle() {
        // Placeholder method, overridden in subclasses
    }
}

class Book_publication extends Book {
    private String title;

    public Book_publication(String authorName, String title) {
        super(authorName);
        this.title = title;
    }

    @Override
    public void displayTitle() {
        System.out.println("Book Publication Title: " + title);
    }
}

class Paper_publication extends Book {
    private String title;

    public Paper_publication(String authorName, String title) {
        super(authorName);
        this.title = title;
    }

    @Override
    public void displayTitle() {
        System.out.println("Paper Publication Title: " + title);
    }
}
