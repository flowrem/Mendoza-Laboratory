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
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter vehicle brand: ");
        String brand = scanner.nextLine();

        System.out.println("Enter speed: ");
        int speed = scanner.nextInt();

        System.out.println("Enter fuel type: ");
        String fuelType = scanner.nextLine();
        
        // Create a Car object
        Car car = new Car(brand, fuelType, speed, 4);
        System.out.println("Enter number of doors: ");
        car.displayInfo();
        
        // Create a Motorcycle object
        Motorcycle motorcycle = new Motorcycle(brand, fuelType, speed, true);
        motorcycle.displayInfo();
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
        System.out.println("Has Sidecar: " + (hasSidecar ? "Yes" : "No"));
    }

}