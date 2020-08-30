public class DatabaseConnection {

    //eager
//    private static final DatabaseConnection instance = new DatabaseConnection();
//
//    private DatabaseConnection(){
//
//    }
//
////    public static DatabaseConnection getConnection(){
//        return instance;
//    }

    //static block
//    private static DatabaseConnection instance;
//    private DatabaseConnection(){}
//    static {
//        instance = new DatabaseConnection();
//    }
//
//    public static DatabaseConnection getConnection(){
//        return instance;
//    }

    //lazy
//    private static DatabaseConnection instance;
//    private DatabaseConnection(){}
//    public static DatabaseConnection getConnection(){
//        if(instance==null){
//            instance = new DatabaseConnection();
//        }
//        return instance;
//    }

    //thread safe lazy loading
    private static DatabaseConnection instance;
    private DatabaseConnection(){}

    public static synchronized DatabaseConnection getConnection(){
        if(instance==null){
            instance = new DatabaseConnection();
        }
        return instance;
    }
}
