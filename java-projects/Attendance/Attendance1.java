import java.io.BufferedWriter; // For writing output to a file
import java.io.File; // For file operations
import java.io.FileWriter; // For writing to a file
import java.util.Arrays;
import java.util.InputMismatchException; // To handle incorrect input types
import java.util.Scanner; // For user input

public class Attendance1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Initialize scanner for user input
        try {
            // Prompt user to enter the number of classes and validate the input
            System.out.println("Enter No. of Classes");
            int noOfClass = 0;
            while (true) {
                try {
                    noOfClass = sc.nextInt();
                    sc.nextLine(); // Consume the newline
                    if (noOfClass < 0) {
                        throw new IllegalArgumentException("number must be positive");
                    }
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a valid integer.");
                    sc.nextLine(); // Clear the invalid input
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            // Initialize arrays to store class names and number of students per class
            String[] className = new String[noOfClass];
            for (int i = 0; i < noOfClass; i++) {
                System.out.println("Enter name of class " + (i + 1));
                className[i] = sc.nextLine(); // Read each class name
            }

            // Allow the user to confirm or change class names
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
                            className[i] = sc.nextLine(); // Change all class names
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
                                    className[i] = sc.nextLine(); // Change particular class name
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

            // Get the number of students for each class
            int totalNoOfStudents = 0;
            int[] noOfStudents = new int[noOfClass];
            for (int i = 0; i < noOfClass; i++) {
                System.out.println("Enter no of students in class " + className[i]);
                while (true) {
                    try {
                        noOfStudents[i] = sc.nextInt();
                        sc.nextLine();
                        if (noOfStudents[i] < 0) {
                            throw new IllegalArgumentException("number of students must be positive");
                        }
                        System.out.println("number of students of class " + className[i] + " = " + noOfStudents[i]);
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println("enter integer input");
                        sc.nextLine();
                    } catch (IllegalArgumentException e) {
                        e.getMessage();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }

            // Calculate total number of students
            for (int i = 0; i < noOfClass; i++) {
                totalNoOfStudents += noOfStudents[i];
            }

            // Allow the user to confirm or change the number of students
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
                            while (true) {
                                try {
                                    noOfStudents[i] = sc.nextInt();
                                    sc.nextLine();
                                    if (noOfStudents[i] < 0) {
                                        throw new IllegalArgumentException("number of students must be positive");
                                    }
                                    break;
                                } catch (InputMismatchException e) {
                                    System.out.println("enter valid input in integer");
                                    sc.nextLine();
                                } catch (IllegalArgumentException e) {
                                    e.getMessage();
                                } catch (Exception e) {
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
                                    while (true) {
                                        try {
                                            noOfStudents[i] = sc.nextInt();
                                            sc.nextLine();
                                            if (noOfStudents[i] < 0) {
                                                throw new IllegalArgumentException("number of students must be positive");
                                            }
                                            break;
                                        } catch (InputMismatchException e) {
                                            System.out.println("Enter valid input in integer");
                                            sc.nextLine();
                                        } catch (IllegalArgumentException e) {
                                            e.getMessage();
                                        } catch (Exception e) {
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

            // Initialize arrays for attendance tracking
            int totalAbsent = 0;
            int firstRollNo;
            int[] absentNos = new int[totalNoOfStudents];
            int[][] rollNoOfStudents = new int[noOfClass][totalNoOfStudents];
            int attendance;

            // Record attendance for each class
            for (int i = 0; i < noOfClass; i++) {
                System.out.println("Enter first roll no of class " + className[i]);
                while (true) {
                    try {
                        firstRollNo = sc.nextInt();
                        sc.nextLine();
                        if (firstRollNo < 0) {
                            throw new IllegalArgumentException("Roll number can never be negative");
                        }
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println("Enter only integer value");
                        sc.nextLine();
                    } catch (IllegalArgumentException e) {
                        e.getMessage();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

                // Ask for attendance status for each student in the class
                for (int j = 0; j < noOfStudents[i]; j++) {
                    rollNoOfStudents[i][j] = firstRollNo + j;
                    System.out.println("Enter 1 if roll no " + (firstRollNo + j) + " is present, or 0 if absent");
                    while (true) {
                        try {
                            attendance = sc.nextInt();
                            sc.nextLine();
                            if (attendance == 0 || attendance == 1) {
                                if (attendance == 0) {
                                    absentNos[totalAbsent++] = rollNoOfStudents[i][j];
                                }
                                break;
                            } else {
                                throw new IllegalArgumentException("Only 0 or 1 is accepted");
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("Enter valid input");
                            sc.nextLine();
                        } catch (IllegalArgumentException e) {
                            e.getMessage();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
            try {
                
                String currentDirectory = System.getProperty("user.dir");
                String filePath = currentDirectory + File.separator + "absent-no.txt";
    
                File f1 = new File(filePath);
    
                if(f1.exists()){
                    System.out.println("File already exists overwriting .......");
                    
                }
                else{
                    System.out.println("Creating New One");
                    boolean createNewFile = f1.createNewFile();
                }

                BufferedWriter bw = new BufferedWriter(new FileWriter(f1));
                bw.write(absentNoString);
                bw.close();
                System.out.println("File written Succesfully");
        } catch (Exception e) {
                // TODO: handle exception
            }

            // Write the final attendance list to a file
            try {
                File file = new File("Attendance.txt");
                BufferedWriter writer = new BufferedWriter(new FileWriter(file));
                writer.write("Attendance Report\n");
                writer.write("Total Classes: " + noOfClass + "\n");
                for (int i = 0; i < noOfClass; i++) {
                    writer.write("Class " + className[i] + ":\n");
                    writer.write("Total Students: " + noOfStudents[i] + "\n");
                    writer.write("Present: " + (noOfStudents[i] - totalAbsent) + "\n");
                    writer.write("Absent: " + totalAbsent + "\n");
                    writer.write("Absent Roll Nos: " + Arrays.toString(Arrays.copyOfRange(absentNos, 0, totalAbsent)) + "\n");
                }
                writer.close();
                System.out.println("Attendance report generated: " + file.getAbsolutePath());
            } catch (Exception e) {
                e.printStackTrace();
            }
        } finally {
            sc.close(); // Close the scanner
        }
    }
}
