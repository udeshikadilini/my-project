package algorithem;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[]={1,7,2,9,34,54,2};
        int last = arr.length-1;
        int result=binarySearch(arr,0,last,9);

        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);
    }

    static int binarySearch(int arr[], int start, int last, int key)
    {
        if (last >= start) {
            int mid = start + (last - start) / 2;

            // If the element is present at the
            // middle itself
            if (arr[mid] == key)
                return mid;

            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > key)
                return binarySearch(arr, start, mid - 1, key);

            // Else the element can only be present
            // in right subarray
            if (arr[mid] > key)
            return binarySearch(arr, mid + 1, last, key);
        }

        // We reach here when element is not present
        // in array
        return -1;
    }
}
