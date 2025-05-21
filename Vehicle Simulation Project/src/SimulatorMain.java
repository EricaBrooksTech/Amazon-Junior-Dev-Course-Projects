public class SimulatorMain {
    public static void main(String[] args) {
        Vehicle myFavoriteVehicle = new Vehicle();

        myFavoriteVehicle.make = "Chevrolet";
        myFavoriteVehicle.model = "Blazer";
        myFavoriteVehicle.color = "Bronze";
        myFavoriteVehicle.year = 2019;

        // Print vehicle details
        System.out.println("Specs of my favorite vehicle:\n" + myFavoriteVehicle.getVehicleDetails());
    }
}