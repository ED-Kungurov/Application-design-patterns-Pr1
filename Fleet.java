import java.util.ArrayList;

public class Fleet {
    ArrayList<Garage> garages = new ArrayList<>();
    public void add(Garage garages) {
        this.garages.add(garages);
    }
    public void delete(Garage garages) {
        this.garages.remove(garages);
    }
    public void search(String search) {
        for(Garage i : garages) {
            for(Vehicle j : i.vehicles) {
                if(j instanceof Motorcycle && j.model == search){
                    System.out.println(i.name + ": " + j.year + " " + j.model + " " + j.mark + " " + ((Motorcycle) j).box + " " + ((Motorcycle) j).type_of_kuzov);
                }else if (j instanceof Car && j.model == search){
                    System.out.println(i.name + ": " + j.year + " " + j.model + " " + j.mark + " " + ((Car)j).num_of_dors + " " + ((Car)j).type_of_transmission);
                }
            }
        }
}}
