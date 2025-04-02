package Executor;

public class PrintRunnable implements Runnable{

    @Override
    public void run(){
        for(int i=1; i<=1000; i++){
            System.out.printf("%d : %c ", i, targetChar);
        }
        System.out.printf("\nTask Done\n", targetChar);
    }

    private final char targetChar;

    public PrintRunnable(char targetChar){
        this.targetChar = targetChar;
    }
}
