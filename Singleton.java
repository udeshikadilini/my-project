public class Singleton {

//    private static final Singleton instance = new Singleton();
//
//    private Singleton(){
//
//    }
//    public static Singleton getInstance(){
//        return instance;
//    }
//    private  static Singleton instance;
//    private Singleton(){}
//
//    static {
//        instance=new Singleton();
//
//       }
//    public static Singleton getInstance() {
//        return instance;
//    }


//    private  static Singleton instance;
//    private Singleton(){}
//
//    public static Singleton getInstance() {
//        if(instance== null){
//            instance=new Singleton();
//
//
//        }
//        return instance;
 //   }

    private  static Singleton instance;
    private Singleton(){}

    public static synchronized Singleton getInstance() {
        if(instance== null){
            instance=new Singleton();


        }
        return instance;
    }

}
