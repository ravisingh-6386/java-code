// //Bubble sort.
// import java.util.*;

// public class sorting {
//     public static void printArray(int arr[]){
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("enter the size of array:");
//         int n=sc.nextInt();
//         int arr[]=new int[n];

//         System.out.print("Enter the element of array:");
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         //int arr[]={7,8,3,2,1};
//         //int arr[]={99,78,88,980,100};
//      //bubble sort
//      for(int i=0;i<arr.length-1;i++){
//         for(int j=0;j<arr.length-i-1;j++){
//             if(arr[j]>arr[j+1]){
//                 //swap
//                 int temp=arr[j];
//                 arr[j]=arr[j+1];
//                 arr[j+1]=temp;  
//             }
//         }
//      }
//      System.out.println("Sorted elemnt is:");
//      printArray(arr);

//     }
    
// }
// import java.util.*;
// public class sorting{
//     public static void printArray(int arr[]){
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("ente the size of array:");
//         int size=sc.nextInt();
//         int arr[]=new int[size];

//         System.out.print("enter the element:");
//         for(int i=0;i<size;i++){
//             arr[i]=sc.nextInt();
//         }
           /// main code /////////////
//         for(int i=0;i<arr.length-1;i++){
//             for(int j=0;j<arr.length-i-1;j++){
//                 if(arr[j]>arr[j+1]){
//                     int temp=arr[j];
//                     arr[j]=arr[j+1];
//                     arr[j+1]=temp;
//                 }
//             }
//         }
//         System.out.print("sorted element is:");
//         printArray(arr);

//     }
// }
//selection sort. time complix=o(n^2);
// import java.util.*;
// public class sorting{
//     public static void printSelection(int arr[]){
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("enter the size of array:");
//         int size=sc.nextInt();
//         int arr[]=new int[size];

//         System.out.print("Enter the element of array:");
//         for(int i=0;i<size;i++){
//             arr[i]=sc.nextInt();
//         }
           ////// code main///////////
//         for(int i=0;i<arr.length;i++){
//             int smallest=i;
//             for(int j=i+1;j<arr.length;j++){
//                 if(arr[smallest]>arr[j]){
//                 smallest=j;

//             }
//         }
//         int temp=arr[smallest];
//         arr[smallest]=arr[i];
//         arr[i]=temp;
//     }
//     printSelection(arr);
//     }
// }

 //insertion sort. time complix=O(n^2);
 import java.util.*;
public class sorting{
    public static void printInsertion(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int size=sc.nextInt();
        int arr[]=new int[size];

        System.out.print("Enter the element of array:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        ///////// code for sort ///////
        for(int i=0;i<arr.length;i++){
            int current=arr[i];
            int j=i-1;
            while(j>=0 && current<arr[j]){
              arr[j+1]=arr[j];
              j--;  

            }
            arr[j+1]=current;
        }
    printInsertion(arr);
}
}








