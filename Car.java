public class Car extends Vehicle {
    int num_of_dors;
    String type_of_transmission;
    public Car(int year, String model, String mark, int num_of_dors, String type_of_transmission) {
        super(year, model, mark);
        this.num_of_dors = num_of_dors;
        this.type_of_transmission = type_of_transmission;
    }
}
