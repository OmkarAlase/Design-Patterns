import java.util.concurrent.Callable;
import java.util.concurrent.ThreadPoolExecutor;

//This class will work efficiently in single threaded environment
public class DBConnectionST {
    private static DBConnectionST connection;
    private DBConnectionST(){}

    public static DBConnectionST getInstance(){

        if(connection == null) {
            connection = new DBConnectionST();
        }
        return  connection;
    }


}
