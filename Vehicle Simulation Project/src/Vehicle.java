
public class Vehicle {
    String make;   // Car make (e.g., Ford, Toyota)
    String model;  // Car model (e.g., Mustang, Camry)
    String color;  // Car color (e.g., Red, Silver)
    int year;      // Car manufacturing year (e.g., 2020)

    public String getVehicleDetails() {
        return "Make: " + make + "\n" +
                "Model: " + model + "\n" +
                "Color: " + color + "\n" +
                "Year: " + year;
    }
}
