abstract class Vehicle {
    String brand;

    Vehicle(String brand){
        this.brand = brand;
    }
    public abstract void start();
    public void stop(){
        System.out.println(brand +" stopped!!!!");
    }
}
