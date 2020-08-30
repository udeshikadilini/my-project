package singleton;



public class DatabaseConnection {
//    private final static DatabaseConnection DATABASE_CONNECTION = new DatabaseConnection();
//
//    private DatabaseConnection(){
//
//    }
//
//    public static DatabaseConnection getDatabaseConnection() {
//        return DATABASE_CONNECTION;
//    }

//    private  static DatabaseConnection DATABASE_CONNECTION;
//    static{
//       DATABASE_CONNECTION= new DatabaseConnection();
//    }
//    private DatabaseConnection(){}
//
//    public static DatabaseConnection getDatabaseConnection() {
//        return DATABASE_CONNECTION;
//    }


    private static DatabaseConnection connection;
    private DatabaseConnection(){}

    public static synchronized DatabaseConnection getConnection() {
        if(connection != null) {
            connection = new DatabaseConnection();
        }
        return connection;
    }
}

