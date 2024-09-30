package roadaccidents;

import java.util.ArrayList;
import java.util.Scanner;

// Subclass extending RoadAccidents
public class RoadAccidentReport extends RoadAccidents {
    private static ArrayList<RoadAccidentReport> accidentList = new ArrayList<>();

    // Constructor that takes the vehicle type, city, and number of accidents
    public RoadAccidentReport(String vehicleType, String city, int numberOfAccidents) {
        super(vehicleType, city, numberOfAccidents);  // Calling the constructor of the superclass
        // Online site
         //Title: constructors-in-jav
         //Author: Geeksforgeeks 
         //Date: 2024
         //URL:https://www.geeksforgeeks.org/constructors-in-java/
         //Accessed: 30 Auggust 2024
    }

    // Method to add an accident record
    public static void recordAccident(String vehicleType, String city, int numberOfAccidents) {
        accidentList.add(new RoadAccidentReport(vehicleType, city, numberOfAccidents));
    }

    // Method to display the accident report
    public static void displayReport() {
        System.out.println("Vehicle Accident Report:");
        System.out.println("========================");
        for (RoadAccidentReport accident : accidentList) {
            System.out.println("City: " + accident.getCity());
            System.out.println("Vehicle Type: " + accident.getAccidentVehicle());
            System.out.println("Number of Accidents: " + accident.getAccidentTotal());
            System.out.println("------------------------");
            
          // Online site
         //Title: What are Java Records and How to Use them Alongside Constructors and Methods?
         //Author: Geeksforgeeks 
         //Date: 2024
         //URL:https://www.geeksforgeeks.org/what-are-java-records-and-how-to-use-them-alongside-constructors-and-methods/
         //Accessed: 30 Auggust 2024
            
            
            
        }
    }

    // Main method to run the program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city, vehicleType;
        int numberOfAccidents;
        String continueInput = "y";

        while (continueInput.equalsIgnoreCase("y")) {
            System.out.print("Enter the city: ");
            city = scanner.nextLine();

            System.out.print("Enter the vehicle type (car/motorbike): ");
            vehicleType = scanner.nextLine();

            System.out.print("Enter the number of accidents: ");
            numberOfAccidents = scanner.nextInt();
            scanner.nextLine();  // Consume the newline

            // Record the accident
            recordAccident(vehicleType, city, numberOfAccidents);

            System.out.print("Do you want to enter another accident? (y/n): ");
            continueInput = scanner.nextLine();
        }

        // Display the final report
        displayReport();

        scanner.close();
    }
}
