import java.util.ArrayList;

class Vehicle {
    private String name;
    private int modelYear;

    public Vehicle(String name, int modelYear) {
        this.name = name;
        this.modelYear = modelYear;
    }

    public String getName() {
        return name;
    }

    public int getModelYear() {
        return modelYear;
    }

    public String toString() {
        return "Vehicle: " + name + ", Model Year: " + modelYear;
    }
}

public class HomeWork {
    public static void main(String[] args) {
        ArrayList<Vehicle> vichalList = new ArrayList<>();

        vichalList.add(new Vehicle("Car", 2022));
        vichalList.add(new Vehicle("Bike", 2021));
        vichalList.add(new Vehicle("Bus", 2020));

        System.out.println("All Vehicles:");
        for (Vehicle v : vichalList) {
            System.out.println(v);
        }
    }
}
