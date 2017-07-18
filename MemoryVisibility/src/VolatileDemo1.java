/**
 * Created by Thpffcj on 2017/7/16.
 */
public class VolatileDemo1 {

    private volatile int number = 0;

    public int getNumber(){
        return this.number;
    }

    public void increase(){
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.number++;
    }

    public static void main(String[] args){
        final VolatileDemo volDemo = new VolatileDemo();
        for(int i=0; i<500; i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    volDemo.increase();;
                }
            }).start();
        }

        while (Thread.activeCount() > 1){
            Thread.yield();
        }
        System.out.println(volDemo.getNumber());
    }
}
