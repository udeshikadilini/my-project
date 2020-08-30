package algorithem;

public class PrintSecondSamllest {

    public static void main(String[] args) {
        int arr[] = {3,12, 1, 2};
        getSecondSmallest(arr);
    }

    public static void getSecondSmallest(int [] elements){
        int smallest = 100;
        int secondSmallest = 100;
        for(int i=0;i<elements.length;i++){
            if(elements[i]==smallest){
                secondSmallest=smallest;
            }
            else if(elements[i]<smallest){
                secondSmallest=smallest;
                smallest=elements[i];
            }
            else if(elements[i]<secondSmallest){
                secondSmallest=elements[i];
            }
        }
        System.out.println("smallest::: "+smallest);
        System.out.println("secondSmallest::: "+secondSmallest);
    }

    public static int getSecondSmallest(int[] a, int total){
        int temp;
        for (int i = 0; i < total; i++)
        {
            for (int j = i + 1; j < total; j++)
            {
                if (a[i] > a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[1];//2nd element because index starts from 0
    }

    static void print2Smallest(int arr[]) {
        int first;
        int second;
        int arr_size = arr.length;

        /* There should be atleast two elements */
        if (arr_size < 2) {
            System.out.println(" Invalid Input ");
            return;
        }
        first =Integer.MAX_VALUE;
        second = Integer.MAX_VALUE;
        for (int i = 0; i < arr_size; i++) {
            /* If current element is smaller than first
              then update both first and second */
            if (arr[i] < first) {
                second = first;
                first = arr[i];
            }

            /* If arr[i] is in between first and second
               then update second  */
            else if (arr[i] < second && arr[i] != first) {
                second = arr[i];
            }
        }
        if (second == Integer.MAX_VALUE) {
            System.out.println("There is no second" +
                    "smallest element");
        } else {
            System.out.println("The smallest element is " +
                    first + " and second Smallest" +
                    " element is " + second);
        }
    }
}
