import java.util.ArrayList;

public class Garage {
    public int number_of_vehicles = 0;
    String name;
    public Garage(String name) {
        this.name = name;
    }
    ArrayList<Vehicle> vehicles = new ArrayList<>();
    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
        number_of_vehicles++;
    }public void deleteVehicle(Vehicle vehicle) {
        if(number_of_vehicles > 0){
        vehicles.remove(vehicle);
        number_of_vehicles--;
    }}
}
