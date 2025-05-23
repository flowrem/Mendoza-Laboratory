import java.util.Scanner;

public class TestVehicle {

    // Main method
    public static void main(String[] args) {
        int vehicleType;
        boolean choice = true;

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n" + "----Welcome to Vehicle Information System!----");

        while (choice) {
            System.out.println("\n" + "[1] Car" + "\n" + "[2] Motorcycle" + "\n" + "[3] Exit");
            System.out.print("\n" + "Enter vehicle type: ");
            vehicleType = scanner.nextInt();

            // Variables to store vehicle details
            String brand, fuelType, hasSidecar;
            int speed, numDoors;

            switch (vehicleType) {
                case 1:
                    scanner.nextLine(); // Consume leftover newline
                    System.out.print("Enter vehicle brand: ");
                    brand = scanner.nextLine();

                    System.out.print("Enter fuel type: ");
                    fuelType = scanner.nextLine();

                    System.out.print("Enter speed: ");
                    speed = scanner.nextInt();
                    scanner.nextLine(); // Consume leftover newline

                    System.out.print("Enter number of doors: ");
                    numDoors = scanner.nextInt();
                    scanner.nextLine(); // Consume leftover newline

                    // Create a Car object
                    Car car = new Car(brand, fuelType, speed, numDoors);
                    System.out.print("\nCar Details:\n");
                    car.displayInfo();

                    break;

                case 2:
                    scanner.nextLine(); // Consume leftover newline
                    System.out.print("Enter vehicle brand: ");
                    brand = scanner.nextLine();

                    System.out.print("Enter fuel type: ");
                    fuelType = scanner.nextLine();

                    System.out.print("Enter speed: ");
                    speed = scanner.nextInt();
                    scanner.nextLine(); // Consume leftover newline

                    System.out.print("Do you have a sidecar in your motorcycle? [yes/no]");
                    hasSidecar = scanner.nextLine();

                    // Create a Motorcycle object
                    Motorcycle motorcycle = new Motorcycle(brand, fuelType, speed, hasSidecar);

                    System.out.println("\nMotorcycle Details:\n");
                    motorcycle.displayInfo();

                    break;

                case 3:
                    scanner.nextLine();
                    System.out.println("Exiting the program " + "\nThank you for using this system!");
                    choice = false;
                    break;

                default:
                    System.out.println("Invalid vehicle type. Please enter either 1, 2, and 3.");
                    break;
            }

            // Condition to stop the loop if the user wants to exit.
            if (vehicleType == 3) {
                choice = false;
                break;
            }

            System.out.print("\n" + "Do you want to input another vehicle? (yes/no): ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("no")) {
                choice = false;
                System.out.println("Thank you for using this system! \n" + "Exiting the program.");
            } else if (!input.equalsIgnoreCase("yes")) {
                System.out.println("\n" + "Invalid input. Try again.");
            }

        }
    }
}

class Vehicle {
    private String brand;
    private int speed;
    private String fuelType;

    // Constructor to initialize variables
    public Vehicle(String brand, String fuelType, int speed) {
        this.brand = brand;
        this.fuelType = fuelType;
        this.speed = speed;
    }

    // Getters to access private variables
    public String getBrand() {
        return brand;
    }

    public String getFuelType() {
        return fuelType;
    }

    public int getSpeed() {
        return speed;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Speed: " + speed + " km/h");
    }
}

class Car extends Vehicle {
    private int numDoors;

    // Constructor to initialize variables in Superclass(vehicle class)
    public Car(String brand, String fuelType, int speed, int numDoors) {
        super(brand, fuelType, speed);
        this.numDoors = numDoors;
    }

    public int getNumDoors() {
        return numDoors;
    }

    // Override the displayInfo function
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Doors: " + numDoors);
    }
}

class Motorcycle extends Vehicle {
    private String hasSidecar;

    // Constructor to initialize variables in Superclass(vehicle class)
    public Motorcycle(String brand, String fuelType, int speed, String hasSidecar) {
        super(brand, fuelType, speed);
        this.hasSidecar = hasSidecar;
    }

    public String getHasSidecar() {
        return hasSidecar;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Has Sidecar: " + hasSidecar);
    }
}