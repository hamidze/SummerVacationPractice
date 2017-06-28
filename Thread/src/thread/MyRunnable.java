package thread;

/**
 * Created by Thpffcj on 2017/6/28.
 */
public class MyRunnable implements Runnable {

    private String name;
    public MyRunnable(String name){
        this.name = name;
    }

    public void run(){
        for(int i=0; i<1000; i++){
            System.out.println(name+":"+i);
        }
    }
}
