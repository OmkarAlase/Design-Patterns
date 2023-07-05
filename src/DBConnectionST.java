import java.util.concurrent.Callable;
import java.util.concurrent.ThreadPoolExecutor;

//This class will work efficiently in single threaded environment
public class DBConnectionST implements Callable<DBConnectionST> {
    private static DBConnectionST connection;
    private DBConnectionST(){}

    public static DBConnectionST getInstance() throws InterruptedException {

        if(connection == null) {
            connection = new DBConnectionST();
        }
        return  connection;
    }

    @Override
    public DBConnectionST call() throws Exception {
       return getInstance();
    }
}
