public class Hello extends Thread{
    @Override
    public void run(){
        for(int i = 0; i<10; i++) {
            System.out.println("Hello from Thread " + targetInt);
        }
    }

    private final int targetInt;

    public Hello(int targetInt){
        this.targetInt = targetInt;
    }
}
