public class Circle extends Shape{

    private float radius;
    public Circle(float radius){
        this.radius = radius;
    }

    @Override
    public double calculateArea(){
        return (Math.PI*Math.pow(radius, 2));
    }
}
