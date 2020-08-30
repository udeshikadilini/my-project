package algorithem;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[]={8,5,2,98,2,2};
        bubbleSort(arr);
        for(int i=0; i< arr.length;i++){
            System.out.println(arr[i]);
        }
//        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[]arr){

        int temp=0;
        int n= arr.length;;
        for(int i=0; i<n; i++){
            for(int j=1;j<(n-i);j++){
                if(arr[j-1]>arr[j]){
                    temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }

    }


}
