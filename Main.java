public class Main {
    public static void main(String[] args) {
        Garage garage1 = new Garage("garage1");
        Garage garage2 = new Garage("garage2");
        Motorcycle motorcycle2 = new Motorcycle(2021 , "Honda NC750SD", "honda", "sport", true);
        Motorcycle motorcycle1 = new Motorcycle(2019 , "Suzuki GSX-S750", "Suzuki", "sport", true);
        Car car1 = new Car(2020, "Chevrolet Trax", "Chevrolet" , 4 , "automatic");
        Car car2 = new Car(2018, "BMW 525", "BMW" , 4 , "mechanic");

        garage2.addVehicle(car1);
        garage2.addVehicle(car2);
        garage2.addVehicle(motorcycle2);

        garage1.addVehicle(car2);
        garage1.addVehicle(motorcycle1);
        garage1.addVehicle(motorcycle2);

        Fleet fleet = new Fleet();
        fleet.add(garage1);
        fleet.add(garage2);
        String searching = "Honda NC750SD";
        fleet.search(searching);
        garage2.deleteVehicle(motorcycle2);
        System.out.println("");
        fleet.search(searching);
    }
}
