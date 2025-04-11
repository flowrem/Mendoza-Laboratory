import java.util.Scanner;

public class vehicle{
    private String brand;
    private int speed;
    private String fuelType;

    // Constructor to initialize variables
    public vehicle(String brand, String fuelType, int speed) {
        this.brand = brand;
        this.fuelType = fuelType;
        this.speed = speed;
    
    }
    // Getters to access private variables
    public String getBrand(){
        return brand;
    }
    public String getFuelType(){
        return fuelType;
    }
    public int getSpeed(){
        return speed;
    }
    public void displayInfo(){
        System.out.println("Brand: " + brand);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Speed: " + speed + " km/h");
    }
    //Main method 
    public static void main(String[] args) {
        String vehicleType;
        boolean choice = true;

        Scanner scanner = new Scanner(System.in);

        while(choice){
            System.out.println("Enter vehicle type (Car/Motorcycle): ");
            vehicleType = scanner.nextLine();

        switch(vehicleType.toLowerCase()){
            case "car":
                System.out.println("Enter vehicle brand: ");
                String brand = scanner.nextLine();

                System.out.println("Enter fuel type: ");
                String fuelType = scanner.nextLine();

                System.out.println("Enter speed: ");
                int speed = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                System.out.println("Enter number of doors: ");
                int numDoors = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                // Create a Car object
                Car car = new Car(brand, fuelType, speed, 4);
                System.out.println("Car Details:");
                System.out.println("Number of Doors: " + numDoors); //Call the unique method in Car class
                car.displayInfo();

                break;

            case "motorcycle":
                System.out.println("Enter vehicle brand: ");
                brand = scanner.nextLine();

                System.out.println("Enter fuel type: ");
                fuelType = scanner.nextLine();

                System.out.println("Enter speed: ");
                speed = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                System.out.println("Has sidecar (true/false): "); //Call the unique method in Motorcycle class
                boolean hasSidecar = scanner.nextBoolean();
                scanner.nextLine();

                // Create a Motorcycle object
                Motorcycle motorcycle = new Motorcycle(brand, fuelType, speed, hasSidecar);

                System.out.println("Motorcycle Details:");
                motorcycle.displayInfo();
                
                break;

            default:
                System.out.println("Invalid vehicle type. Please enter either 'Car' or 'Motorcycle'.");
                break;
        }   
        System.out.println("Do you want to input another vehicle? (yes/no): ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("no")) {
                choice = false;
                System.out.println("Exiting the program.");
            } else if (!input.equalsIgnoreCase("yes")) {
                System.out.println("Invalid input. Try again.");
            }
        
       
        }
    }
}
class Car extends vehicle{
    private int numDoors;

    // Constructor to initialize variables in Superclass(vehicle class)
    public Car(String brand, String fuelType, int speed, int numDoors) {
        super(brand, fuelType, speed);
        this.numDoors = numDoors;
    }

    public int getNumDoors(){
        return numDoors;
    }

    // Override the displayInfo function
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Number of Doors: " + numDoors);
    }
}
class Motorcycle extends vehicle{
    private boolean hasSidecar;

    // Constructor to initialize variables in Superclass(vehicle class)
    public Motorcycle(String brand, String fuelType, int speed, boolean hasSidecar) {
        super(brand, fuelType, speed);
        this.hasSidecar = hasSidecar;
    }
    
    public boolean getHasSidecar(){
        return hasSidecar;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Has Sidecar: " + hasSidecar);
    }

}