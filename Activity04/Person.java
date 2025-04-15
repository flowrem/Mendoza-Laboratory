package Activity04;

import java.util.Scanner;

public class Person {
    private String name;
    private int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }   
}
class SchoolTest{
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       System.out.println("Welcome to the School Management System!\n");

       String name, subject, position, gradeLevel;
       int id, choice;
       boolean continueInput = true;

         while (continueInput) {
              System.out.println("Choose the type of person to add: ");
              System.out.println("[1] Student\n[2] Teacher\n[3] Staff\n[4] Exit");
              choice = scanner.nextInt();
              scanner.nextLine(); // Consume newline
    
              switch (choice) {
                case 1:
                     System.out.print("Enter student name: ");
                     name = scanner.nextLine();
                     System.out.print("Enter student ID: ");
                     id = scanner.nextInt();
                     scanner.nextLine(); // Consume newline
                     System.out.print("Enter grade level: ");
                     gradeLevel = scanner.nextLine();
    
                     Student student = new Student(name, id, gradeLevel);
                     student.displayInfo();
                     break;
    
                case 2:
                     System.out.print("Enter teacher name: ");
                     name = scanner.nextLine();
                     System.out.print("Enter teacher ID: ");
                     id = scanner.nextInt();
                     scanner.nextLine(); // Consume newline
                     System.out.print("Enter subject: ");
                     subject = scanner.nextLine();
    
                     Teacher teacher = new Teacher(name, id, subject);
                     teacher.displayInfo();
                     break;
    
                case 3:
                     System.out.print("Enter staff name: ");
                     name = scanner.nextLine();
                     System.out.print("Enter staff ID: ");
                     id = scanner.nextInt();
                     scanner.nextLine(); // Consume newline
                     System.out.print("Enter position: ");
                     position = scanner.nextLine();
    
                     Staff staff = new Staff(name, id, position);
                     staff.displayInfo();
                     break;
    
                case 4:
                     System.out.println("Thank you for using the School Management System!");
                     System.out.println("Exiting the program...");
                     continueInput = false;
                     break;
    
                default:
                     System.out.println("Invalid choice. Please try again.");
              }

              //Stop the loop if the user wanta to exit the program.
              if(choice == 4){
                 continueInput = false;
                 break;
              }
              System.out.println("Do you still want to continue using the system? (yes/no): ");
              String input = scanner.nextLine();
                if (input.equalsIgnoreCase("no")) {
                    continueInput = false;
                    System.out.println("Thank you for using the School Management System!");
                    System.out.println("Exiting the program...");
                } else if (!input.equalsIgnoreCase("yes")) {
                    System.out.println("Invalid input. Please try again.");
                }
         }
    }
}
