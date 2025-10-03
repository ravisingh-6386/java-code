
// import java.util.Collections;

// public class arraylist {
//     public static void main(String[] args) {
//       ArrayList<Integer>list=new ArrayList<Integer>();
//       list.add(2);
//       list.add(3);
//       list.add(4);
//       list.add(5);
//       System.out.println(list); 
      
//       int element1=list.get(0);
//       int element2=list.get(1);
//       int element3=list.get(2);
//       int element4=list.get(3);

//       System.out.println(element1);
//       System.out.println(element2);
//       System.out.println(element3);
//       System.out.println(element4);

//       list.add(0,9);
//       System.out.println(list);

//       list.set(4,10);
//       System.out.println(list);

//       list.remove(2);
//       System.out.println(list);

//       int size=list.size();
//       System.out.println(size);

//       for(int i=0;i<list.size();i++){
//         System.out.print(list.get(i)+" ");
//       }
//       System.out.println();

      
//       Collections.sort(list);
//       System.out.println(list);
//     }
    
// }
// import java.util.*;
// public class arraylist{
//   public static void main(String[] args){
//     ArrayList<Integer>list=new ArrayList<Integer>();
//     list.add(99);
//     list.add(88);
//     list.add(499);
//     list.add(188);

//     Collections.sort(list);
//     System.out.println(list);

   

//   }
// }
//linear search.
/*import java.util.*;
public class arraylist{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size :");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("enter the element:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("enter element to search:");
        int key=sc.nextInt();

        boolean found=false;
        for(int i=0;i<n;i++){
            if(arr[i]==key){
                System.out.println("element found at index:"+i);
                found=true;
                break;
            }
        }
        if(!found){
            System.out.println("element not present");
        }
       sc.close();

    }
}*/
//binary search.
import java.util.*;
public class arraylist{
  public static int binarySearch(int[] arr,int key){
    int low=0;
    int high=arr.length-1;
    while(low<=high){
      int mid=(low+high)/2;
      if(arr[mid]==key){
        return mid;
      }
      else if (arr[mid]<key) {
          low=mid+1;
      }else{
        high=mid-1;
      }
    }
    return -1;
  }
  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.print("enter the size:");
      int n=sc.nextInt();
      int[] arr=new int[n];
      System.out.print("enter sorted element:");
      for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
      }
      System.out.print("enter element to search:");
      int key=sc.nextInt();
      int result=binarySearch(arr,key);
      if(result==-1){
        System.out.println("element not found!");
      }else{
        System.out.println("element found at index"+" "+result);
      }
  }

}
