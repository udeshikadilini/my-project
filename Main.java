import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
    public static void main(String[] args) {

        Calculation cal = new Calculation();
        System.out.println(cal.add(4,5));
        System.out.println(cal.add(4,5,6));

    }

}


class Calculation{

    public int add(int x,int y){
        System.out.println("add numbers");
        return x+y;
    }
    public int add(int x,int y,int z){
        System.out.println("add thereeeeeee");
        return x+y+z;
    }
    public int add(int x,double y) {
        System.out.println("add thereeeeeee");
        return (int) (x + y);
    }

}


