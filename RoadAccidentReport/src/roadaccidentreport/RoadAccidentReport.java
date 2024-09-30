package roadaccidentreport;
import java.util.Scanner;


public class RoadAccidentReport {
    public static void main(String[] args) {
        // Declare arrays to store accident data
        int[][] accidents = new int[3][2]; // 3 cities, 2 types of vehicles (cars and motorbikes)
        String[] cities = {"Cape Town", "Johannesburg", "Port Elizabeth"};
        String[] vehicleTypes = {"Cars", "Motor Bikes"};
        // Online site
         //Title: Adding values into DataPoint array
         //Author: Stack Overflow
         //Date: 2024
         //URL: https://stackoverflow.com/questions/41403318/adding-values-into-datapoint-array-causing-the-application-crash-while-running
         //Accessed: 30 Auggust 2024
        Scanner scanner = new Scanner(System.in);

        // Input accident data for each city
        for (int i = 0; i < cities.length; i++) {
            System.out.println("Enter accident data for " + cities[i] + ":");
            for (int j = 0; j < vehicleTypes.length; j++) {
                System.out.print(vehicleTypes[j] + " accidents: ");
                accidents[i][j] = scanner.nextInt();
                // Online site
         //Title: Adding values into DataPoint array
         //Author: Stack Overflow
         //Date: 2024
         //URL: https://stackoverflow.com/questions/54691873/how-to-use-for-each-in-java-to-get-input#:~:text=1.%20You%20should%20use%20a%20for-loop%20with%20index%20for%20that,
         //Accessed: 30 Auggust 2024
            }
            System.out.println();
        }

        // Print the accident report
        System.out.println("Road Accident Report");
        System.out.println("-------------------------------");
        System.out.println("City            Cars   Motor Bikes");
        System.out.println("-------------------------------");

        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-15s %5d %10d\n", cities[i], accidents[i][0], accidents[i][1]);
        }

        // Calculate and display the total accidents
        System.out.println("-------------------------------");
        System.out.println("Total Accidents:");
        int totalCars = 0, totalBikes = 0;
        for (int i = 0; i < accidents.length; i++) {
            totalCars += accidents[i][0];
            totalBikes += accidents[i][1];
             //Title: Swig Calculator
         //Author: Geekforgeeks
         //Date: 2024
         //URL: https://www.geeksforgeeks.org/java-swing-simple-calculator/
         //Accessed: 30 Auggust 2024
        }
        
        System.out.println("Cars: " + totalCars);
        System.out.println("Motor Bikes: " + totalBikes);
    }
}
