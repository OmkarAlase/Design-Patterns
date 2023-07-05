import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService es = Executors.newCachedThreadPool();
        for(int i = 0;i < 100000;i++){
            Future<DBConnectionST> con = es.submit(DBConnectionST.getInstance());
            System.out.println(con.get().hashCode());
        }
    }
}