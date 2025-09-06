public class Motorcycle extends Vehicle {
    String type_of_kuzov;
    Boolean box;
    public Motorcycle(int year, String model, String mark, String type_of_kuzov, Boolean box) {
        super(year, model, mark);
        this.type_of_kuzov = type_of_kuzov;
        this.box = box;
    }
}
