public class testArea {
    public static void main(String[] args){
        Circle cir = new Circle(5);
        System.out.println("Area of the circle is: " +cir.calculateArea());

        Square squ = new Square(5);
        System.out.println("Area of the square is :"+squ.calculateArea());
    }
}
