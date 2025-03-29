package Interface;

public class Eagle extends Bird{

    public Eagle(){
        super("Eagle");
    }
    @Override
    public void fly(){
        System.out.println("Eagles can fly");
    }
}
