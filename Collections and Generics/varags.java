public class varags {
    public static void main(String[] args){
        System.out.println(sum(4, 5));
        System.out.println(sum(4,5,6));
        System.out.println(sum(6,7,8,9,2,1));
    }

    public static int sum(int... a){
        int sum = 0;
        for(int i: a){
           sum += i;
        }
        return sum;
    }
}
