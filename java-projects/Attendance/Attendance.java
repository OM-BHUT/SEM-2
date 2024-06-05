//Attendance Taking System
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Attendance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Taking input from user of number of classes
        try {
            System.out.println("Enter No. of Classes");
            int noOfClass = 0;
            while (true) {
                try {
                    noOfClass = sc.nextInt(); // abc\n
                    sc.nextLine(); 
                    if(noOfClass<0){
                        throw new IllegalArgumentException("number must be positive");
                    }
                    break;
                } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                sc.nextLine(); //clear the buffer
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage()); 
            }catch(Exception e){
                e.printStackTrace();
            }
        }

            //Taking input of name of class
            String[] className = new String[noOfClass];
            for (int i = 0; i < noOfClass; i++) {
                System.out.println("Enter name of class " + (i + 1));
                className[i] = sc.nextLine();
            }
            for (int i = 0; i < noOfClass; i++) {
                System.out.println("Name of class " + (i + 1) + " = " + className[i]);
            }
            //Checking if user wants to change name of class
            while (true) {
                System.out.println("Enter 0 to change anything or enter 1 for final submit");
                String check = sc.nextLine();

                if (check.equals("1")) {
                    break;
                } else if (check.equals("0")) {
                    System.out.println("Enter \"0 to Change All\" or \"1 to change particular class\"");
                    String change = sc.nextLine();

                    if (change.equals("0")) {
                        for (int i = 0; i < noOfClass; i++) {
                            System.out.println("Enter name of class " + (i + 1));
                            className[i] = sc.nextLine();
                        }
                    } else if (change.equals("1")) {
                        while (true) {
                            System.out.println("Enter name of class you want to change");
                            String check1 = sc.nextLine();
                            boolean wrongClassName = true;

                            while (wrongClassName) {
                                boolean flag = false;
                                for (int j = 0; j < noOfClass; j++) {
                                    if (check1.equals(className[j])) {
                                        flag = true;
                                        wrongClassName = false;
                                        break;
                                    }
                                }
                                if (!flag) {
                                    System.out.println("Name of class not found, enter again");
                                    check1 = sc.nextLine();
                                }
                            }

                            for (int i = 0; i < noOfClass; i++) {
                                if (check1.equals(className[i])) {
                                    System.out.println("Enter new name");
                                    className[i] = sc.nextLine();
                                }
                            }

                            System.out.println("Enter \"0 to change class name\" or \"1 to submit\"");
                            String finalSubmit = sc.nextLine();
                            if (finalSubmit.equals("1")) {
                                break;
                            } else {
                                while (true) {
                                    System.out.println("Enter \"0 to submit\" or \"1 to change class name\"");
                                    finalSubmit = sc.nextLine();

                                    if (finalSubmit.equals("0") || finalSubmit.equals("1")) {
                                        break;
                                    }
                                }
                            }
                        }
                    } else {
                        while (true) {
                            System.out.println("Enter \"0 to Change All\" or \"1 to change particular class\"");
                            change = sc.nextLine();

                            if (change.equals("0") || change.equals("1")) {
                                break;
                            }
                        }
                    }
                }
            }

            for (int i = 0; i < noOfClass; i++) {
                System.out.println("Name of class " + (i + 1) + " = " + className[i]);
            }
            //Taking input of number of students in each class
            int totalNoOfStudents = 0;
            int[] noOfStudents = new int[noOfClass];
            for (int i = 0; i < noOfClass; i++) {
                System.out.println("Enter no of students in class " + className[i]);
                while (true) {
                try {
                    noOfStudents[i] = sc.nextInt();
                    sc.nextLine();
                    if(noOfStudents[i]<0){
                        throw new IllegalArgumentException("number of students must be positive");
                    }
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("enter integer input");
                    sc.nextLine();
                }catch(IllegalArgumentException e){
                    e.getMessage();
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
            }
            for (int i = 0; i < noOfClass; i++) {
                totalNoOfStudents += noOfStudents[i];
            }
            for (int i = 0; i < noOfClass; i++) {
                System.out.println("Number of students in class " + className[i] + " = " + noOfStudents[i]);
            }
            // Checking if user wants to change number of students from any class
            while (true) {
                System.out.println("Enter 0 to change no of students or enter 1 for final submit");
                String check = sc.nextLine();

                if (check.equals("1")) {
                    break;
                } else if (check.equals("0")) {
                    System.out.println("Enter \"0 to Change All\" or \"1 to change particular class\"");
                    String change = sc.nextLine();

                    if (change.equals("0")) {
                        for (int i = 0; i < noOfClass; i++) {
                            System.out.println("Enter no of students in class " + (i + 1));
                            while(true){
                                try{
                                noOfStudents[i] = sc.nextInt();
                                    sc.nextLine();
                                    if(noOfStudents[i]<0){
                                        throw new IllegalArgumentException("number of students must be positive");
                                    }
                                    break;
                                }catch(InputMismatchException e){
                                    System.out.println("enter valid input in integer");
                                    sc.nextLine();
                                    // e.printStackTrace();
                                }catch(IllegalArgumentException e){
                                    e.getMessage();
                                }catch(Exception e){
                                    e.printStackTrace();
                                }
                           }
                        }
                    } else if (change.equals("1")) {
                        while (true) {
                            System.out.println("Enter name of class you want to change number of students");
                            String check1 = sc.nextLine();
                            boolean wrongClassName = true;

                            while (wrongClassName) {
                                boolean flag = false;
                                for (int j = 0; j < noOfClass; j++) {
                                    if (check1.equals(className[j])) {
                                        flag = true;
                                        wrongClassName = false;
                                        break;
                                    }
                                }
                                if (!flag) {
                                    System.out.println("Name of class not found, enter again");
                                    check1 = sc.nextLine();
                                }
                            }

                            for (int i = 0; i < noOfClass; i++) {
                                if (check1.equals(className[i])) {
                                    System.out.println("Enter new no of students");
                                    while(true){
                                        try{
                                        noOfStudents[i] = sc.nextInt();
                                            sc.nextLine();
                                            if(noOfStudents[i]<0){
                                                throw new IllegalArgumentException("number of students must be positive");
                                            }
                                            break;
                                        }catch(InputMismatchException e){
                                            System.out.println("Enter valid input in integer");
                                            sc.nextLine();
                                            // e.printStackTrace();
                                        }catch(IllegalArgumentException e){
                                            e.getMessage();
                                        }catch(Exception e){
                                            e.printStackTrace();
                                        }
                                   }
                                }
                            }

                            System.out.println("Enter \"0 to submit\" or \"1 to change no of students\"");
                            String finalSubmit = sc.nextLine();
                            if (finalSubmit.equals("0")) {
                                break;
                            }
                        }
                    } else {
                        while (true) {
                            System.out.println("Enter \"0 to Change All\" or \"1 to change particular class\"");
                            change = sc.nextLine();
                            if (change.equals("0") || change.equals("1")) {
                                break;
                            }
                        }
                    }
                }
            }
            // Taking attendance of students
            int totalAbsent = 0;
            int firstRollNo;
            int[] absentNos = new int[totalNoOfStudents];
            int[][] rollNoOfStudents = new int[noOfClass][totalNoOfStudents];
            int attendance;
            for (int i = 0; i < noOfClass; i++) {
                System.out.println("Enter first roll no of class " + className[i]);
                while (true) {
                    try {
                        firstRollNo = sc.nextInt();
                        sc.nextLine();
                        if(firstRollNo<0){
                            throw new IllegalArgumentException("Roll number can never be negative");
                        }
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println("Enter only integer value");
                        sc.nextLine();
                    }catch(IllegalArgumentException e){
                        System.out.println(e.getMessage());
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                }
                
                System.out.println("Enter 1 for present and 0 for absent");
                for (int j = 0; j < noOfStudents[i]; j++) {
                    System.out.println("Roll no " + firstRollNo);
                    while (true) {
                        try {
                            attendance = sc.nextInt();
                            sc.nextLine();
                            if(attendance!=0 && attendance!=1 ){
                                throw new IllegalArgumentException("Enter 0 or 1");
                            }
                            break;
                        } catch (InputMismatchException e) {
                            System.out.println("Enter only integer value");
                            sc.nextLine();
                        }catch(IllegalArgumentException e){
                            System.out.println(e.getMessage()); 
                        }catch(Exception e){
                            e.printStackTrace();
                        }
                    }
                    if (attendance == 0) {
                        absentNos[totalAbsent] = firstRollNo;
                        totalAbsent++;
                    }
                    rollNoOfStudents[i][j] = firstRollNo;
                    firstRollNo++;
                }
            }
            //Printing absent number of students
            String absentNoString = "";
            System.out.println("Absent numbers of all classes");
            for (int i = 0; i < totalAbsent; i++) {
                if (i == totalAbsent - 1) {
                    absentNoString = absentNoString + absentNos[i];
                } else {
                    absentNoString = absentNoString + absentNos[i] + ", ";
                }
            }
            System.out.println(absentNoString);
            // Checking if user wants to change attendence of any student
            String changeAbsent;
            while (true) {
                System.out.println("Enter 0 to change any students attendance in his roll number or 1 for submit");
                changeAbsent = sc.nextLine();

                if (changeAbsent.equals("1")) {
                    break;
                } else if (changeAbsent.equals("0")) {
                    System.out.println("Enter Roll No To Change");
                    int changeRollNo;
                    boolean rollNoFound = false;
                    int a ;
                    while (true) {
                        
                        try {
                            changeRollNo = sc.nextInt();
                            outer:
                            for (int j = 0; j < noOfClass; j++) {
                                inner:
                                for (int k = 0; k < noOfStudents[j]; k++) {
                                    if (changeRollNo == rollNoOfStudents[j][k]) { 
                                        rollNoFound = true;
                                        break outer;
                                    }
                                    else{
                                        rollNoFound = false;
                                    }
                                }
                            }
                            if(rollNoFound == false){
                                throw new IllegalArgumentException("Roll number not founded");
                            }
                                                     
                            break;
                        } catch (InputMismatchException e) {
                            System.out.println("Enter only integer value");
                            sc.nextLine();
                        }catch(IllegalArgumentException e){
                            System.out.println(e.getMessage()); 
                        }catch(Exception e){
                            e.printStackTrace();
                        }
                    }
                    System.out.println("Enter 1 for present and 0 for absent");

                    while (true) {
                        try {
                            a = sc.nextInt();
                            sc.nextLine();
                            
                            if(a!=0 && a!=1 ){
                                throw new IllegalArgumentException("enter 0 or 1");
                            }
                            break;
                        } catch (InputMismatchException e) {
                            System.out.println("Enter only integer value");
                            sc.nextLine();
                        }catch(IllegalArgumentException e){
                            System.out.println(e.getMessage()); 
                        }catch(Exception e){
                            e.printStackTrace();
                        }
                    }

                    if (a == 1) {
                        for (int i = 0; i < totalAbsent; i++) {
                            if (changeRollNo == absentNos[i]) {
                                rollNoFound = true;
                                for (int j = i; j < totalAbsent - 1; j++) {
                                    absentNos[j] = absentNos[j + 1];
                                }
                                totalAbsent--;
                                break;
                            }
                        }
                        if (!rollNoFound) {
                            System.out.println("roll number not found in absent list");
                        }
                    } else if (a == 0) {
                        outer :
                        for (int j = 0; j < noOfClass; j++) {
                            inner1:
                            for(int i=0;i<totalAbsent;i++){
                                if(changeRollNo == absentNos[i]){
                                    System.out.println("already in absent");
                                    break outer;
                                }      
                            }
                            inner2:
                            for (int k = 0; k < noOfStudents[j]; k++) {
                                if (changeRollNo == rollNoOfStudents[j][k]) {
                                    totalAbsent++;
                                    absentNos[totalAbsent - 1] = changeRollNo;
                                }
                            }
                        }
                    }

                //Arranging absent students roll number by using selection sorting
                // 104 -> 101,102,104,202
                System.out.println("Total absent students: " + totalAbsent);

                for (int i = 0; i < totalAbsent; i++) {
                     for (int j = i + 1; j < totalAbsent; j++) {
                             if (absentNos[i] > absentNos[j]) {
                                  int temp = absentNos[i];
                                     absentNos[i] = absentNos[j];
                                         absentNos[j] = temp;
                }
                        }
                            }


                    absentNoString = "";
                    for (int i = 0; i < totalAbsent; i++) {
                        if (i == totalAbsent - 1) {
                            absentNoString = absentNoString + absentNos[i];
                        } else {
                            absentNoString = absentNoString + absentNos[i] + ", ";
                        }
                    }
                    System.out.println("Updated roll no " + absentNoString);
                }
            }

            //Writing absent number of students in a file 
            try {
                
                String currentDirectory = System.getProperty("user.dir");
                System.out.println("Current Directory: "+currentDirectory);

                String filePath = currentDirectory + File.separator + "absent-no.txt";
                System.out.println("current file path: "+filePath);
    
                File f1 = new File(filePath);
    
                if(f1.exists()){
                    System.out.println("File already exists overwriting .......");
                    
                }
                else{
                    System.out.println("Creating New One");
                    boolean createNewFile = f1.createNewFile();
                    if(!createNewFile){
                        System.out.println("Failed to create new file");
                        return;
                    }
                }

                BufferedWriter bw = new BufferedWriter(new FileWriter(f1));
                bw.write(absentNoString);
                bw.close();
                System.out.println("File written Succesfully");
        } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sc.close();
        }
    }
}
