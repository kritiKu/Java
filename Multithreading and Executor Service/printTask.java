package Runnable;

public class printTask implements Runnable{

    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            System.out.println(i + " "+targetChar);
        }
        System.out.println(targetChar+" task completed");
    }

    private final char targetChar;

    public printTask(char targetChar){
        this.targetChar = targetChar;
    }
}
