package threadClass;

public class testingMultithreading {
    public static void main(String[] args){
        long startTime = System.currentTimeMillis();
//         for(int i =1; i<=1000; i++){
//             System.out.println(i);
//         }
//        System.out.println("First loop completed");
//         for(int i=1; i<=1000; i++){
//             System.out.println(i);
//         }
//        System.out.println("Second loop completed");
//
//        for(int i=0; i<=1000; i++){
//             System.out.println(i);
//         }
        System.out.println("Third loop completed");

        long endTime = System.currentTimeMillis();
        System.out.println("Total time = "+(endTime-startTime));
    }
}
