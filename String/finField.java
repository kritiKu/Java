public class finField {
    final int noOfWheels;

    public finField(int noOfWheels){
        this.noOfWheels = noOfWheels;
    }

    
    public static void main(String[] args) {
        finField car = new finField(4);
       System.out.println("The no of wheels of the car is: " +car.noOfWheels); 
    }   
}
