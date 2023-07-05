//This Method will work efficiently in multithreaded environment.As we are eagly initializing the variable at class level
public class DBConnectionEagerInititalization {
    private static DBConnectionEagerInititalization connection = new DBConnectionEagerInititalization();

    private DBConnectionEagerInititalization(){}

    public static DBConnectionEagerInititalization getInstance(){
        return connection;
    }
}
