//     public static void main(String[] args) {
//        HashSet<Integer> set=new HashSet<>();

//        // add elements.
//        set.add(1);
//        set.add(2);
//        set.add(3);
//        System.out.println(set);
//        // search element.
//        if(set.contains(1)){
//         System.out.println("true");
//        }else{
//         System.out.println("false");
//        }

//        // remove element.
//        ///set.remove(2);
//        System.out.println(set);
//        //size of set.
//        System.out.println("the size of hasset:"+set.size());

//        //iterator.
//        Iterator it=set.iterator();
//        while(it.hasNext()){
//         System.out.println(it.next());
//        }
//     }
// }
// import java.util.*;
// public class hasset{
//     public static void main(String[] args){
//       HashMap<String,Integer> map=new HashMap<>();

//       // insertion in map.
//       map.put("India",900 );
//       map.put("USA",879);
//       map.put("China",456);

//       System.out.println(map);

//       // search  in map.
//       if(map.containsKey("USA")){
//         System.out.println("Key is present in map");
//       }else{
//         System.out.println("Key is not present in map");
//       }
//       System.out.println(map.get("India"));
//       System.out.println(map.get("pakistan"));

//       int arr[]={12,15,18};
//       for(int val:arr){
//         System.out.print(val+" ");
//       }
//       System.out.println();

//       // iterator in hashmap.
//       for(Map.Entry<String,Integer>e:map.entrySet()){
//         System.out.println(e.getKey()+" "+e.getValue());
//         //System.out.println(e.getValue());
//       }
//       System.out.println();

//       Set<String>keys=map.keySet();
//       for(String key:keys){
//         System.out.println(key+" "+map.get(key));
//       }
//       System.out.println();
//       map.remove("USA");
//       System.out.println(map);

//     }
// }
//
// HashMap and implementation in java.

// public class hasset{
//     public static void main(String[] args){
        
//     }
// }

// majority element.
// import java.util.*;
// public class hasset{
//     public static void majorityElement(int nums[]){
//         HashMap<Integer,Integer>map=new HashMap<>();
//         int n=nums.length;
//         for(int i=0;i<n;i++){
//             if(map.containsKey(nums[i])){
//                 map.put(nums[i],map.get(nums[i])+1);
//             }else{
//                 map.put(nums[i],1);
//             }
//         }
//         for(int key:map.keySet())
// {
//     if(map.get(key)>n/3){
//         System.out.println(key);
//     }
// }
//     }
//     public static void main(String[] args){
//        // int nums[]={1,3,2,5,1,3,1,5,1};
//        int nums[]={1,2};
//         majorityElement(nums);
//     }
// }

// union of 2 arrays.
// import java.util.*; 
// public class hasset{
//     public static void main(String[] args){
//         int arr1[]={7,3,9};
//         int arr2[]={6,3,9,2,9,4};
//         HashSet<Integer>set=new HashSet<>();
//         for(int i=0;i<arr1.length;i++){
//             set.add(arr1[i]);
//         }
//         for(int i=0;i<arr2.length;i++){
//             set.add(arr2[i]);
//         }
//         System.out.print("union of 2 arrays is:");
//         for(int val:set){
//             System.out.print(val+" "); 
//         }

//         System.out.println("\nsize of array is :"+set.size());
//     }
//}

// intersection of 2 arrays.
// import java.util.*;
// public class hasset{
//     public static void main(String[] args){
//         int arr1[]={7,3,9};
//         int arr2[]={6,3,9,2,9,4};
//         HashSet<Integer>set=new HashSet<>();
//         for(int i=0;i<arr1.length;i++){
//             set.add(arr1[i]);
//         }
//         HashSet<Integer>intersection=new HashSet<>();
//         for(int i=0;i<arr2.length;i++){
//             if(set.contains(arr2[i])){
//                 intersection.add(arr2[i]);
//             }
//         }
//         System.out.print("intersection of 2 arrays is:");
//         for(int val:intersection){
//             System.out.print(val+" "); 
//         }

//         System.out.println("\nsize of intersection array is :"+intersection.size());
//     }
// }

// find itinerary from tickets.
// import java.util.*;
// public class hasset{

//     public static String getStart(HashMap<String,String>tick){
//         HashMap<String, String>revMap=new HashMap<>();
//         for(String key:tick.keySet()){
//             revMap.put(tick.get(key),key);
//         }
//         for(String key:tick.keySet()){
//             if(!revMap.containsKey(key)){
//                 return key;
//             }
//         }
//         return null;
//     }
//     public static void main(String[] args){
//         HashMap<String,String>tickets=new HashMap<>();
//         tickets.put("chennai","Bengaluru");
//         tickets.put("Mumbai","Delhi");
//         tickets.put("Goa","Chennai");
//         tickets.put("Delhi","Goa");

//         String start=getStart(tickets);
//          while(tickets.containsKey(start)){
//             System.out.print(start+"->");
//             start=tickets.get(start);
//          }
//            System.out.println(start);

//     }
// }

// import java.util.*;

// public class hasset {

//     public static String getStart(HashMap<String,String> tick) {
//         HashMap<String, String> revMap = new HashMap<>();
//         for (String key : tick.keySet()) {
//             revMap.put(tick.get(key), key);
//         }
//         for (String key : tick.keySet()) {
//             if (!revMap.containsKey(key)) {
//                 return key;
//             }
//         }
//         return null;
//     }

//     public static void main(String[] args) {
//         HashMap<String,String> tickets = new HashMap<>();
//         tickets.put("chennai", "Bengaluru");
//         tickets.put("Mumbai", "Delhi");
//         tickets.put("Goa", "chennai");
//         tickets.put("Delhi", "Goa");

//         String start = getStart(tickets);
//         while (tickets.containsKey(start)) {
//             System.out.print(start + "->");
//             start = tickets.get(start);
//         }
//         System.out.println(start);
//     }
// }
