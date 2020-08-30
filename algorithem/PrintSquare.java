package algorithem;

import java.util.Arrays;

public class PrintSquare {

    public static void main(String[] args) {

//        double arr[] = {1,2,3,4.5,5,6,7,8,9.2,10,11,12,13,14,15,16.6,17,18,19,20};
//        for(int i=0; i<=arr.length-1;i++){
//            int sqrt=(int) Math.sqrt(arr[i]);
//            if(sqrt * sqrt== i){
//                System.out.println(i);
//            }
//        }
//    }
        int arr[] = {1, 3, 5};
        int arr2[] = {2, 4, 6};
        int[] array = new int[6];

         for(int i=0; i<arr.length;i++){
             System.out.println(arr[i]);


             for(int j=i; j<=i;j++){
                 System.out.println(arr2[j]);

             }

         }

        System.out.println(Arrays.toString(array));
    }
}
