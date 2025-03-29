public abstract class Vehicle {
    private int noOfTyre;

    public Vehicle(int noOfTyre){
        this.noOfTyre = noOfTyre;
    }

    public abstract void makeStartSound();
    public int getNoOfTyre(){
        return noOfTyre;
    }

    public void setNoOfTyre(int noOfTyre){
        this.noOfTyre = noOfTyre;
    }

    public void compute(){
        System.out.println("Going.....");
    }
}
