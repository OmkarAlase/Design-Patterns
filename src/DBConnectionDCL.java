// Double check locking - Efficient way to implement Singletone pattern
public class DBConnectionDCL {
    private static DBConnectionDCL connection;
    private DBConnectionDCL(){}

    public synchronized static DBConnectionDCL getInstance(){
        if(connection == null) {
            synchronized (DBConnectionDCL.class) {
                if (connection == null) {
                    connection = new DBConnectionDCL();
                }
            }
        }
        return connection;
    }
}

