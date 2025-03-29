public class Square extends Shape{
    private float side;
    public Square(float side){
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}
