import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {


        int[] arr = {4, 5, 1, 2, 3, 3};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));

        //bubble sort
        bubbleSort(arr);//sorting array elements using bubble sort
        System.out.println("Array After Bubble Sort");
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }


    static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    //swap elements
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
    }

        public static void quickSort(int[] arr, int start, int end){

        int partition = partition(arr, start, end);

        if(partition-1>start) {
            quickSort(arr, start, partition - 1);
        }
        if(partition+1<end) {
            quickSort(arr, partition + 1, end);
        }
    }

    public static int partition(int[] arr, int start, int end){
        int pivot = arr[end];

        for(int i=start; i<end; i++){
            if(arr[i]<pivot){
                int temp= arr[start];
                arr[start]=arr[i];
                arr[i]=temp;
                start++;
            }
        }

        int temp = arr[start];
        arr[start] = pivot;
        arr[end] = temp;

        return start;
    }
}
