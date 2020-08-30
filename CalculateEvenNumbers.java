public class CalculateEvenNumbers {

    public static void main(String[] args) {
        calculateNumbers(10);

    }
    public static void calculateNumbers(int count){

        int sum=0;
        for(int i=0; i<count; i++){
            if(i % 2==0){
                sum += i;
            }

        }
        System.out.println(sum);

    }
}
