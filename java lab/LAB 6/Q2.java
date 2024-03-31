// Declare a class called book having author_name as private data
// member. Extend book class to have two sub classes called
// book_publication & paper_publication. Each of these classes have
// private member called title. Write a complete program to show
// usage of dynamic method dispatch (dynamic polymorphism) to display 
// book or paper publications of given author.Use command line
// arguments for inputting data.
public class Q2 {
    public static void main(String[] args) {
        
        Book a = new Book();
        a.displayAuthorName(args[0]);
        Book b1 = new Book_publication();
        b1.displayTitle(args[1]);
        Book b2 = new Paper_publication();
        b2.displayTitle(args[2]);
    }
    
}
class Book{
    private String author_name;
    public void displayAuthorName(String s1){
        System.out.println("author name="+s1);
    }
    public void displayTitle(String s1){
        System.out.println("Title="+s1);
    }
}
class Book_publication extends Book{
    private String title;
    public void displayTitle(String s1){
        super.displayTitle(s1);
    }
}
class Paper_publication extends Book{
    private String title;
    public void displayTitle(String s1){
        super.displayTitle(s1);
    }
}