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
public class Q3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        String name = sc.nextLine();
        System.out.println("Enter age");
        int age = sc.nextInt();
        System.out.println("Enter phone number");
        int phone_number = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter address");
        String address = sc.nextLine();
        System.out.println("Enter salary of employee");
        double salaryE = sc.nextDouble();
        System.out.println("Enter salary of manager");
        double salaryM = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter specialization");
        String specialization = sc.nextLine();
        System.out.println("Enter department");
        String department = sc.nextLine();

        Employee e1 = new Employee(name,age,phone_number,address,salaryE,specialization);
        e1.printSalary();
        e1.printDetails();
        Manager man1 = new Manager(name,age,phone_number,address,salaryM,department);
        man1.printSalary();
        man1.printDetails();
    }
}
class Member{
    String name;
    int age;
    int phone_number;
    String address;
    double salary;
    public Member(String name,int age,int phone_number,String address,double salary){
        this.name=name;
        this.age=age;
        this.phone_number=phone_number;
        this.address=address;
        this.salary=salary;
    }
    public void printSalary(){
        System.out.println("Salary of member="+salary);

    }
    public void printDetails(){
        System.out.println("name="+name+"\nage="+age+"\nphone number="+phone_number+"\naddress="+address+"\nsalary="+salary);
    }
}
class Employee extends Member{
    String specialization;
    public Employee(String name,int age,int phone_number,String address,double salary,String specialization){
        super(name,age,phone_number,address,salary);
        this.specialization=specialization;
    }
    public void printSalary(){
        System.out.println("Salary of employee="+salary);
    }
    public void printDetails(){
        super.printDetails();
    }
}
class Manager extends Member{
    String department;
    public Manager(String name,int age,int phone_number,String address,double salary,String department){
        super(name,age,phone_number,address,salary);
        this.department=department;
    }
    public void printSalary(){
        System.out.println("Salary of manager="+salary);
    }
    public void printDetails(){
        super.printDetails();
    }
}