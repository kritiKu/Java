public class threadState extends  Thread{

    @Override
    public void run(){
        try{
            Thread.sleep(4000);
            System.out.println(Thread.currentThread().getState());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
