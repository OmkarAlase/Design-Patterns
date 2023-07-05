//This approach will work in multithreaded environment but in some cases threads will starve
//this is lazy initialization
public class DBConnectionSynchronizedMethod {
    private static DBConnectionSynchronizedMethod connection;
    private DBConnectionSynchronizedMethod(){}

    public synchronized static DBConnectionSynchronizedMethod getInstance(){
        if(connection == null){
            connection = new DBConnectionSynchronizedMethod();
        }

        return connection;
    }
}
