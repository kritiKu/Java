package Lambda;

import java.util.function.BinaryOperator;

public class multiplication {
    public static void main(String[] args) {

        BinaryOperator<Integer> mult = (a, b) -> a*b;
        System.out.println(mult.apply(4, 5));
    }
}
