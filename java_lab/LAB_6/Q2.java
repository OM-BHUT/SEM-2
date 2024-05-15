// Declare a class called book having author_name as private data
// member. Extend book class to have two sub classes called
// book_publication & paper_publication. Each of these classes have
// private member called title. Write a complete program to show
// usage of dynamic method dispatch (dynamic polymorphism) to display 
// book or paper publications of given author.Use command line
// arguments for inputting data.
public class Q2 {
    public static void main(String[] args) {
        System.out.println("enter author name");
        String aName=args[0];
        System.out.println("enter title of book");
        String bTitle=args[1];
        System.out.println("enter title of paper");
        String pTitle=args[2];
        Book a = new Book(aName);
        a.displayAuthorName();
        Book b1 = new Book_publication(aName,bTitle);
        b1.displayTitle(args[1]);
        Book b2 = new Paper_publication(aName,bTitle);
        b2.displayTitle(args[2]);
    }
    
}
class Book{
    private String authorName;
    public Book(String authorName){
        this.authorName=authorName;
    }
    public void displayAuthorName(){
        System.out.println("author name="+authorName);
    }
    public void displayTitle(String s1){
        System.out.println("Title="+s1);
    }
}
class Book_publication extends Book{
    private String title;
    public Book_publication(String authorName,String title){
        super(authorName);
        this.title=title;
    }
    
    public void displayTitle(String s1){
        super.displayTitle(s1);
    }
}
class Paper_publication extends Book{
    private String title;
    public Paper_publication(String authorName,String title){
        super(authorName);
        this.title=title;
    }
    
    public void displayTitle(String s1){
        super.displayTitle(s1);
    }
}