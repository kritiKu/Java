public class testCalculator {
    public static void main(String[] args){
        Calculator calc = new Calculator();
        System.out.println(calc.sum(5, 6));
        System.out.println(calc.sum(2, 7, 9));
        System.out.println(calc.sum(5.5, 8.2));
    }
}
