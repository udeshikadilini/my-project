package Inheritance;

public class Main {
    public static void main(String[] args) {
        Shape shape=new Rectangle();
        shape.draw();

        Rectangle reSdh=new Rectangle();
        reSdh.printshape();


    }

}
 class Shape {
    private int height=10;
    protected int temp=40;
    int width=20;

    public void draw(){
        System.out.println("drwa shape");

    }

}
   class Rectangle extends Shape{

       public void draw(){
           System.out.println(temp);
           System.out.println(width);
           System.out.println("draw rectangle");

       }
       public void printshape(){
           System.out.println("child class");
       }

    }
