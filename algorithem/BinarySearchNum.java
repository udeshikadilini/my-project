package algorithem;

public class BinarySearchNum {
    public static void main(String[] args) {
        int arr[]={4,6,2,8,4,9};
        int last= arr.length-1;

        int result=  binarySearch(arr,0,last,6);
        if(result==-1){
            System.out.println("Element not present");
        }else{
            System.out.println("Element found at index " + result);
        }

    }

    static int binarySearch(int arr[],int start, int last,int key){
        if (last >= start) {

            int mid= last+(last-start)/2;
            if(arr[mid]==key){
                return mid;
            }

            if(arr[mid]>key){
                return binarySearch(arr,start,mid-1,key);
            }
            if(arr[mid]<key){
                return binarySearch(arr,mid+1,last,key);
            }

        }

        return-1;
    }

}
