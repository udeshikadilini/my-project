public class Square {
    public static void printSquare(){
        int starting_number = 1;
        int ending_number = 100;
        System.out.println("Perfect Numbers between "+starting_number+ " and "+ending_number);
        for (int i = starting_number; i <= ending_number; i++) {

            int number = i;

            int sqrt = (int) Math.sqrt(number);
            if (sqrt * sqrt == number) {
                System.out.println(number+ " = "+sqrt+"*"+sqrt);
            }
        }
    }

    public static void main(String[] args) {
//        Square sq =new Square();
//        sq.printSquare();
        Square.printSquare();



    }
}
