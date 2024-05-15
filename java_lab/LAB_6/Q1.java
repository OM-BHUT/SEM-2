// Declare a class called student having following data
// members:id_no, no_of_subjects_registered, subject_code,
// subject_credits, grade_obtained and spi. Define constructor and
// calculate_spi methods.Define main to instantiate an array for
// objects of class student to process data of n students to be given
// as command line arguments
import java.util.Scanner;
public class Q1{
public static void main(String[] args){   
      int n=Integer.parseInt(args[0]);
      Student[] a = new Student[n];
      for(int i=0;i<n;i++){
         a[i]=new Student();
         a[i].inputData(i);
      }
      for(int i=0;i<n;i++){
         a[i].display(i);
      }
   }
   
}
class Student{
   Scanner sc=new Scanner(System.in);
   int id_no;
   int no_of_subjects_registered;
   String subject_code;
   int subject_credits[];
   double grade_obtained[];
   double spi;
   public Student(){
      this.id_no=0;
      this.no_of_subjects_registered=0;
      this.subject_code=null;
      this.subject_credits[0]=0;
      this.grade_obtained[0]=0;
      this.spi=0;
   }

   public void inputData(int i){
      System.out.println("enter id no. of student "+(i+1));
      id_no=sc.nextInt();
      System.out.println("enter no. of students registered "+(i+1));
      no_of_subjects_registered=sc.nextInt();
      System.out.println("enter subject code of student "+(i+1));
      subject_code=sc.nextLine();
      sc.nextLine();
      System.out.println("enter subject credits of student "+(i+1));
      subject_credits[i]=sc.nextInt();
      System.out.println("enter grade obtained of student "+(i+1));
      grade_obtained[i]=sc.nextFloat();
      System.out.println("enter spi of student "+(i+1));
      spi=sc.nextFloat();
      sc.nextLine();
      
   }
   public void calculateSPI() {
      float totalCredits = 0;
      double totalPoints = 0;
      for (int i = 0; i < no_of_subjects_registered; i++) {
          totalCredits = totalCredits + subject_credits[i];
          totalPoints = totalPoints+ subject_credits[i] * grade_obtained[i];
      }
      spi = totalPoints / totalCredits;
  }

   public void display(int i){
      System.out.println("id of student "+(i+1)+"= "+id_no);
      System.out.println("no. of students registered of student "+(i+1)+"= "+no_of_subjects_registered);
      System.out.println("subject code of student "+(i+1)+"="+subject_code);
      System.out.println("subject credits of student "+(i+1)+"= "+subject_credits);
      System.out.println("grade obtained of student "+(i+1)+"= "+grade_obtained);
      System.out.println("spi of student "+(i+1)+"=" +spi);
   }
   
}