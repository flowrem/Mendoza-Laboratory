package Activity02;

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

    class SchoolTest {
        public static void main(String[] args) {
            String name, gradeLevel, department, subject;
            int id, choice;
            boolean run = true;

            Scanner scanner = new Scanner(System.in);

            System.out.println("----Welcome to the School Management System!----\n");

            while (run) {
                System.out.println("\nPlease select an option:");
                System.out.println("1. Add Student");
                System.out.println("2. Add Teacher");
                System.out.println("3. Add Staff");
                System.out.println("4. Exit");

                choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (choice) {
                    case 1:
                        System.out.print("Enter Student Name: ");
                        name = scanner.nextLine();
                        System.out.print("Enter Student ID: ");
                        id = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        System.out.print("Enter Grade Level: ");
                        gradeLevel = scanner.nextLine();
                        Student student = new Student(name, id, gradeLevel);
                        student.displayInfo();
                        break;
                    case 2:
                        System.out.print("Enter Teacher Name: ");
                        name = scanner.nextLine();
                        System.out.print("Enter Teacher ID: ");
                        id = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        System.out.print("Enter Subject: ");
                        subject = scanner.nextLine();
                        Teacher teacher = new Teacher(name, id, subject);
                        teacher.displayInfo();
                        break;
                    case 3:
                        System.out.print("Enter Staff Name: ");
                        name = scanner.nextLine();
                        System.out.print("Enter Staff ID: ");
                        id = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        System.out.print("Enter Department: ");
                        department = scanner.nextLine();
                        Staff staff = new Staff(name, id, department);
                        staff.displayInfo();
                        break;
                    case 4:
                        System.out.println("Thank you for using the system!");
                        System.out.println("Exiting the program.");
                        run = false;
                        break;
                    default:
                        System.out.println("Invalid choice! Please try again.");
                }

                // Condition to stop the loop if the user wants to exit.
                if (choice == 4) {
                    run = false;
                    break;
                }

                // Ask the user if they want to input another data
                System.out.println("Do you want to input another data? (yes/no)");
                String input = scanner.nextLine();
                if (input.equalsIgnoreCase("no")) {
                    run = false;
                    System.out.println("Thank you for using this system! \n" + "Exiting the program.");
                } else if (!input.equalsIgnoreCase("yes")) {
                    System.out.println("\n" + "Invalid input. Try again.");
                }
            }

        }
    }
}
