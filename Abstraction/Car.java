public class Car extends Vehicle {
    private int noOfDoors;

    @Override
    public void makeStartSound(){
        System.out.println("Vroooommmmm......");
    }
    public Car(){
        super(4);
    }
}
