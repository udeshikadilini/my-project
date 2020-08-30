package algorithem;

public class SumofPairs {
    public static void main(String[] args) {
  //      int arr[] = {3, 2, 5, 5, 7, 3, 8};
//        int sum = 10;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i+1; j < arr.length; j++) {
//               if( arr[i] + arr[j]==sum){
//                   System.out.println(arr[i] +" "+arr[j]);
//               }
//
//            }
//        }
        int sum=0;
      int start=0;
      int end=10;
      for(int i=start; i<=end;i++){
          if(start%2==0){
            sum=sum+start;

          }
          start++;

      }
        System.out.println(sum);


    }
}
