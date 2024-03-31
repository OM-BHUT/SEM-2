import java.util.Scanner;
public class Q1{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(args[0]);
    student[] a = new student[n];
    for(int i=0;i<n;i++)
    {
        a[i]=new student(n);
    }
    for(int i=0;i<n;i++){ 
    System.out.println("enter id no:");
    a[i].id_no=sc.nextInt();
    System.out.println("enter no of students registered:");
    a[i].no_of_subjects_registered=sc.nextInt();
    System.out.println("enter no of subjects");
    int no_of_subjects =sc.nextInt();
    int[] array_of_students =new int[no_of_subjects];
     for(int j=0;j<no_of_subjects;i++){
        sc.nextLine();
      System.out.println("enter subject codes of:"+j+"st subject");
         a[i].subject_code[j]=sc.next();
            System.out.println("enter subject credits:");
         a[i].subject_credits[j]=sc.nextInt();
            System.out.println("enter grade obtained:");
         a[i].grade_obtained[j]=sc.next().charAt(0);
            System.out.println("enter spi:");
         a[i].spi=sc.nextDouble();
}  

 }
  }
public void calculate_spi(){

}
   }
class student{
    int id_no;
    int no_of_subjects_registered;
    String[] subject_code;
    int[] subject_credits;
    char[]  grade_obtained;
    double spi;
    static int c=0;
    student(int n){
        c++;
        no_of_subjects_registered = n;
        subject_code=new String[n];
        subject_credits=new int[n];
        grade_obtained=new char[n];

    }
}
