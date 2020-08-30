package algorithem;

public class PrimeNumber {
    public static void main(String[] args) {
        primeNumbers(1,100);

    }

    static void primeNumbers(int start, int end){

        while (start<end) {

            boolean flag = false;
            for (int i = 2; i <= start / 2; i++) {

                if (start % i == 0) {
                    flag = true;
                    break;
                }

            }

            if (!flag && start != 1 && start != 0) {
                System.out.println("prime" + start);

            }
            start++;
        }

    }
}
