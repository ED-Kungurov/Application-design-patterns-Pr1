class Vehicle {
    int year;
    String model;
    String mark;
    public Vehicle(int year, String model, String mark) {
        this.year = year;
        this.model = model;
        this.mark = mark;
    }
    public void start() {
        System.out.print ("двигатель запущен");
    }
    public void end() {
        System.out.print("двигатель заглушен");
    }
}