package roadaccidents;

public class RoadAccidents implements IRoadAccidents {
    protected String vehicleType;
    protected String city;
    protected int accidentTotal;

    // Constructor for the RoadAccidents class
    public RoadAccidents(String vehicleType, String city, int accidentTotal) {
        this.vehicleType = vehicleType;
        this.city = city;
        this.accidentTotal = accidentTotal;
        // Online site
         //Title: constructors-in-jav
         //Author: Geeksforgeeks 
         //Date: 2024
         //URL:https://www.geeksforgeeks.org/constructors-in-java/
         //Accessed: 30 Auggust 2024
    }

    // Implement the method to return the vehicle type
    @Override
    public String getAccidentVehicle() {
        return vehicleType;
    }

    // Implement the method to return the city
    @Override
    public String getCity() {
        return city;
    }

    // Implement the method to return the total number of accidents
    @Override
    public int getAccidentTotal() {
        return accidentTotal;
    }
}
