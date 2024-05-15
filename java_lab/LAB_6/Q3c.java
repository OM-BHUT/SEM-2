// Create a class named 'Member' having the following members:
// 1. Name
// 2. Age
// 3. Phone number
// 4. Address
// 5. Salary
// It also has a method named 'printSalary' which prints the salary
// of the members.
// Two classes 'Employee' and Manager' inherits the 'Member' class.
// The 'Employee' and 'Manager' classes have data members
// 'specialization' and 'department' respectively. Now assign name,
// age, phone number address and salary to an employee and a manager
// by making an object of both of these classes and print the same
// along with specialization and department respectively.

import java.util.Scanner;
public class Q3c{
    public static void main(String[] args){
        
        
        

        Employee e1 = new Employee();
        e1.getEmployeeDetails();
        e1.printSalary();
        e1.printDetails();
        Manager man1 = new Manager();
        man1.getManagerDetails();
        man1.printSalary();
        man1.printDetails();
    }
}
class Member{
    Scanner sc = new Scanner(System.in);
    String name;
    int age;
    int phone_number;
    String address;
    double salary;
    public Member(){
        this.name=null;
        this.age=0;
        this.phone_number=0;
        this.address=null;
        this.salary=0;
    }
    public void getDetails(){
        
        System.out.println("Enter name");
        name = sc.nextLine();
        System.out.println("Enter age");
        age = sc.nextInt();
        System.out.println("Enter phone number");
        phone_number = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter address");
        address = sc.nextLine();
        
    }
    public void printSalary(){
        System.out.println("Salary of member="+salary);

    }
    public void printDetails(){
        System.out.println("name= "+name+"\nage= "+age+"\nphone number= "+phone_number+"\naddress= "+address+"\nsalary= "+salary);
    }
    
}
class Employee extends Member{
    String specialization;
    public Employee(){
        super();
        this.specialization=null;
    }
    public void printSalary(){
        System.out.println("Salary of employee= "+salary);
    }
    public void printDetails(){
        super.printDetails();
    }
    public void getEmployeeDetails(){
        super.getDetails();
        System.out.println("Enter salary of employee");
        double salaryE = sc.nextDouble();
        System.out.println("Enter specialization");
        String specialization = sc.nextLine();
    }
}
class Manager extends Member{
    String department;
    public Manager(){
        super();
        this.department=null;
    }
    public void printSalary(){
        System.out.println("Salary of manager= "+salary);
    }
    public void printDetails(){
        super.printDetails();
    }
    public void getManagerDetails(){
        super.getDetails();
        System.out.println("Enter salary of manager");
        double salaryM = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter department");
        String department = sc.nextLine();
    }
}