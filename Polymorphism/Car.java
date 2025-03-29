public class Car extends Vehicle {

    @Override
    public void service(){
        super.service();
        System.out.println("This is child class service method");
    }
}
