public class Q2gpt {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Please provide author name, book publication title, and paper publication title as command line arguments.");
            return;
        }
        
        Book a = new Book();
        a.displayAuthorName(args[0]);
        Book b1 = new Book_publication();
        b1.displayTitle(args[1]);
        Book b2 = new Paper_publication();
        b2.displayTitle(args[2]);
    }
}

class Book {
    private String author_name;
    
    public void displayAuthorName(String s1) {
        System.out.println("author name=" + s1);
    }
    
    public void displayTitle(String s1) {
        System.out.println("Title=" + s1);
    }
}

class Book_publication extends Book {
    private String title;
    
    @Override
    public void displayTitle(String s1) {
        super.displayTitle(s1);
    }
}

class Paper_publication extends Book {
    private String title;
    
    @Override
    public void displayTitle(String s1) {
        super.displayTitle(s1);
    }
}
