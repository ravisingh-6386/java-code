// sorting of two array.

// import java.util.Scanner;
// public class array{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);

        // there will be two  different arrays
        // System.out.print("enter the size of array:");

        // int[] arr1=new int[array];
        // int[] arr2=new int[array];

        // System.out.print("enter the element of first array:");
        // for(int i=0;i<array;i++){
        //     arr1[i]=sc.nextInt();
        // }
        // System.out.print("enter the element of second array:");
        // for(int i=0;i<array;i++){
        //     arr2[i]=sc.nextInt();
        // }
        // if(Arrays.equals(arr1,arr2)){
        //     System.out.println("array are equals");
        // }else{
        //     System.out.println("array are not equals");
        // }
        

    // }
// }
//adding the array.
// import java.util.*;
// public class array{
//     public static void main(String[] args){
//         int[] arr1={1,2,3,4,5};
//         int[] arr2={6,7,8,9,10};
//         int[] result=new int[arr1.length+arr2.length];
        
//         for(int i=0;i<arr1.length;i++){
//             result[i]=arr1[i];
//         }
//             for(int i=0;i<arr2.length;i++){
//                 result[arr1.length+i]=arr2[i];
//             }
//             System.out.println(Arrays.toString(result));
//     }
// }
// reverse the array .
// public class array{
//     public static void main(String[] args){
//         int arr[]={1,2,3,4,5};
//         int n=arr.length;
//         int l=0,r=n-1;
//         while(l<r){
//             arr[l]=arr[l]^arr[r];
//             arr[r]=arr[l]^arr[r];
//             arr[l]=arr[l]^arr[r];
//             l++;
//             r--;
//         }
//         for(int x:arr){
//             System.out.print(x+" ");

//         }
//     }
// }
/// return the max value for array .(O(n))).
public class array{
    public static void main(String[] args) {
        int[] arr={2,45,6,5,4};
        int max=findMax(arr);
        System.out.println("the maximum value is:"+max);
    }
        public static int findMax(int[] arr){
            int max=arr[0];
            for(int i=0;i<arr.length;i++){
                if(arr[i]>max){
                    max=arr[i];
                }
            }
return max;
        
    }
}