import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask[] randomNumberTasks = new FutureTask[5];

        for(int i=0; i<5 ; i++){
            Callable  c = new Example();
            randomNumberTasks[i] = new FutureTask(c);
            Thread t = new Thread(randomNumberTasks[i]);
            t.start();
        }

        for(int i=0; i<5; i++){
            System.out.println(randomNumberTasks[i].get());
        }

    }
}
