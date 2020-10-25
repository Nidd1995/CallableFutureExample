import java.util.Random;
import java.util.concurrent.Callable;

// return a random number after a delay of 0-4 sec
public class Example implements Callable {


    public Object call() throws Exception {
        Random gen = new Random();
           Integer i =  gen.nextInt(5);
           Thread.sleep(i*1000);
           return  i;
    }
}
