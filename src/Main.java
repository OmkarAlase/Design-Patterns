import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main implements Runnable{
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        for(int i = 0;i < 1000;i++){
            Thread t = new Thread(new Main());
            t.start();
        }

    }

    @Override
    public void run() {
        Leaderboard leaderboard = null;
        try {
            leaderboard = Leaderboard.getInstance();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thread: " + Thread.currentThread().getName() + ", Leaderboard Instance: " + leaderboard);
    }
}