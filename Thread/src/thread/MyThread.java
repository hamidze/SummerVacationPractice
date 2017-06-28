package thread;

/**
 * Created by Thpffcj on 2017/6/28.
 */
public class MyThread extends Thread {

    private String name;

    public MyThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for(int i=0; i<1000; i++){
            System.out.println(name+":"+i);
        }
        super.run();
    }
}
