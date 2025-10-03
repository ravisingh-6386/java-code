
// import java.lang.reflect.Array;
// import java.util.SequencedSet;
// import javax.swing.text.StyleContext;

//print number 5 to 1;
// public class recursion{
//     public static void printNumbers(int n){
//         if(n==0){
//             return;
//         }
//         System.out.println(n);
//         printNumbers(n-1);
//     }
//     public static void main(String[] args){
//         // for(int i=5;i>0;i--){
//         //     System.out.println(i);
            
//         // }
//         int n=5;
//         printNumbers(n);

//     }
// }

//print numbers 1 to 5;
// public class recursion{
//     public static void printNumbers(int n){
//         if(n==6){
//             return;
//         }
//         System.out.println(n);
//         printNumbers(n+1);
//     }
//     public static void main(String[] args){
//         // for(int i=5;i>0;i--){
//         //     System.out.println(i);
            
//         // }
//         int n=1;
//         printNumbers(n);

//     }
// }
//print first n natural numbers;
// public class recursion {
//     public static void printSum(int i,int n,int sum){
//         if(i==n){
//             sum=sum+i;
//             System.out.println(sum);
//             return;
//         }
//         sum=sum+i;
//         printSum(i+1,n,sum);
//     }
//     public static void main(String[] args){
//         printSum(1,1000,0);
//     }
// }

///factorial of a number n////////////
// import java.util.*;
// public class recursion{
//     public static int  calcFactorial(int n){
//         if(n==0 || n==1){
//             return 1;
//         }
//         int Fact_nm1=calcFactorial(n-1);
//         int fact_n=n*Fact_nm1;
//         return fact_n;
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the value of n:");
//         int n=sc.nextInt();

//         //int n=5;
//         int ans=calcFactorial(n);
//         System.out.println(ans);

        
//     }
// }
/// fibonacci series  .///
//import java.util.*;
// public class recursion{
//     public static void printFib(int a,int b,int n){
//         if(n==0){
//             return;
//         }
//         int c=a+b;
//         System.out.println(c);
//         printFib(b,c,n-1);
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("enter the value of n:");
//         int n=sc.nextInt();
//         int a=0;
//         int b=1;
//         System.out.println(a);
//         System.out.println(b);
//        // int n;
//         printFib(a,b,n-2);
        
//     }
// }
// ///print x^n stack height =n;
// public class recursion{
//     public static int calcPower(int x,int n){
//         if(n==0){
//             return 1;
//         }
//         if(x==0){
//             return 0;
//         }
//         int xPownm1=calcPower(x,n-1);
//         int xPown=x*xPownm1;
//         return xPown;
//     }
//     public static void main(String[] args) {
//        int x=2,n=2;
//        int ans=calcPower(x,n);
//        System.out.println(ans);

        
//     }
// }

//print x^n stack height =logn;
// public class recursion{
//     public static int calcPower(int x,int n){
//         if(n==0){
//             return 1;
//         }
//         if(x==0){
//             return 0;
//         }
//         if(n%2==0){
//             return calcPower(x,n/2)*calcPower(x,n/2);
//         }
//         else{
//             return calcPower(x,n/2)*calcPower(x,n/2)*x;
//         }
//     }
//     public static void main(String[] args) {
//        int x=2,n=10;
//        int ans=calcPower(x,n);
//        System.out.println(ans);

        
//     }
// }

//Tower of Hanoi. stack data structure. important. time complexity is O(2^n).
// import java.util.*;
// public class recursion{
//     public static void towerOHanoi(int n,String src,String helper,String dest){
//         if(n==1){
//             System.out.println("tranfer disk " + n +"from"+src+" to"+dest);
//             return;
//         }
//         towerOHanoi(n-1,src,dest,helper);
//         System.out.println(" tranfer disk " + n +" from "+ src +" to "+dest);
//         towerOHanoi(n-1,helper,src,dest);
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the value of num:");
//         int num=sc.nextInt();

//          towerOHanoi(num, "S", "H", "D");
//     }
// } 
///print a string in reverse order.
// import java.util.*;
// public class recursion{
//     public static String printReverse(String str){
//         if(str.isEmpty()){
//             return str;
//         }else{
//             return printReverse(str.substring(1)) + str.charAt(0);
//         }
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("enter the string:");
//         String name=sc.next();
//         String original=name;
//         String reversed=printReverse(original);

//         System.out.println("Original: "+original);
//         System.out.println("Reverse: "+reversed);

//     }
// }
//////////or///// both method are good. time compleity is O(n).
// public class recursion{
//     public static void printReverse(String str,int idx){
//         if(idx==0){
//            System.out.println(str.charAt(idx));
//           return;
//         }
//         System.out.print(str.charAt(idx));
//         printReverse(str,idx-1);
//     }
//     public static void main(String[] args){
//        String str="Helloworld";
//        printReverse(str,str.length()-1);

//     }
// }

// find the 1st and last occurance of an element in string.time complexity O(n).

//check if an array is sorted(Strictly increasing).ex=(1,2,3,4,5) and time complexity O(n).

// public class recursion{
//     public static boolean printSorted(int arr[],int idx){
//         if(idx==arr.length-1){
//             return true;
//         }
//         if(arr[idx]<arr[idx+1]){
//             return printSorted(arr,idx+1);
//         }else{
//             return false;
//         }
//     }
//     public static void main(String[] args) {
//         int arr[]={8,9,10};
//         System.out.println(printSorted(arr,0));
        
//     }
// }
 
//Move all "X" to the end of the string.ex="axbcxxd". time compleity is O(n).
// import java.util.*;
// public class recursion{
//     public static void printString(String str,int idx,int count,String newString){
//         if(idx==str.length()){
//             for(int i=0;i<count;i++){
//                 newString+="x";
//             }
//             System.out.println(newString);
//             return;
//         }
//         char currchar=str.charAt(idx);
//         if(currchar=='x'){
//             count++;
//             printString(str,idx+1,count,newString);
//         }else{
//             newString+=currchar;
//             printString(str,idx+1,count,newString);
//         }
//     }
//         public static void main(String[] args) {
//            String str="axbcxxd";
//            printString(str,0,0,""); 
//     }
// }

//Remove duplicates in a string. example="abbccda". time complexity O(n).
// public class recursion{
//     public static void main(String[] args){

//     }
// }

// print all the subsequences of a string.example="abc".vvvmi qustion.time complexity O(2^n).
// public class recursion{
//     public static void subsequences(String str,int idx,String newStr){
//         if(idx==str.length()){
//             System.out.println(newStr);
//             return;

//         }
//         char currchar=str.charAt(idx);

//         subsequences(str,idx+1,newStr + currchar);

//         subsequences(str,idx+1,newStr);

//     }
//     public static void main(String[] args) {
//         String str="abc";
//         subsequences(str,0,"");
//     }
// }

//print all the unique subsequences of a string.exaple="aaa".
// import java.util.HashSet;
// public class recursion{
//     public static void subsequences(String str,int idx,String newStr,HashSet<String> set){
//         if(idx==str.length()){
//             if(set.contains(newStr)){
//                 return;
//             }else{
//                 System.out.println(newStr);
//                 set.add(newStr);
//                 return;
//             }
//         }
//         char currchar=str.charAt(idx);

//         subsequences(str,idx+1,newStr + currchar,set);

//         subsequences(str,idx+1,newStr,set);

//     }
//     public static void main(String[] args) {
//         String str="aaa";
//         HashSet<String> set=new HashSet<>();
//         subsequences(str,0,"",set);
//     }
// }

//print keypad combination.
// public class recursion{
//     public static String[] keypad={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
//     public static void printComb(String str,int idx,String combination){
//         if(idx==str.length()){
//             System.out.println(combination);
//             return;
//         }
//         char currchar=str.charAt(idx);
//         String mapping=keypad[currchar-'0'];

//         for(int i=0;i<mapping.length();i++){
//             printComb(str,idx+1,combination+mapping.charAt(i));
//         }
//     }

//     public static void main(String[] args){
//         String str="4";
//         printComb(str,0,"");

//     }
// }

///// important qustions//////
/// print all permitations of a string.time complexity=O(n!).
// public class recursion{
//     public static void printPerm(String str,String permutation){
//         if(str.length()==0){
//             System.out.println(permutation);
//             return;
//         }
//         for(int i=0;i<str.length();i++){
//             char currchar=str.charAt(i);
//             String newStr=str.substring(0,i)+str.substring(i+1);
//             printPerm(newStr,permutation+currchar);


//         }
//     }
//     public static void main(String[] args) {
//         String str="abc";
//         printPerm(str,"");
        
//     }
// }
// count total paths in a maze to move from(0,0) to (n,m).n=3,m=3.
// public class recursion{
//     public static int countPaths(int i,int j,int n,int m){
//         if(i==n ||j==m){
//             return 0;
//         }
//         if(i==n-1 && j==m-1){
//             return 1;
//         } 
//         int downPaths=countPaths(i+1,j,n,m);
//         int rightPaths=countPaths(i,j+1,n,m);
//         return downPaths + rightPaths;
//     }
//     public static void main(String[] args) {
//         int n=3,m=3;
//         int totalPaths=countPaths(0,0,n,m);
//         System.out.println(totalPaths);

//     }
// }

//Place tiles of size 1xm i floor of size nxm; n=4;m=2
// public class recursion{
   
//     public static int placeTiles(int n,int m){
//         if(n==m){
//             return 2;
//         }
//         if(n<m){
//             return 1;
//         }
//         int vertPlacements=placeTiles(n-m, m);

//         int horzPlacements=placeTiles(n-1, m);

//         return vertPlacements+horzPlacements;

//     }

//     public static void main(String[] args) {
//         int n=4,m=2;
//         System.out.println(placeTiles(n, m));
         
//     }
// }

/*find the number of ways in which you can invite n people to your party,single or in pairs */
// public class recursion{
//     public static int callGests(int n){
//         if( n<=1){
//             return 1;
//         }
//         int ways1=callGests(n-1);
//         int ways2=(n-1)*callGests(n-2);
//         return ways1+ways2;
//     }
//     public static void main(String[] args) {
//         int n=4;
//         System.out.println(callGests(n));
//     }

// }
/*print all the subsets of a set of first n natural numbers */
import java.util.*;

public class recursion {

    public static void generateSubsets(int n, int idx, ArrayList<Integer> current) {
        if (idx > n) {
            System.out.println(current);
            return;
        }

        current.add(idx);
        generateSubsets(n, idx + 1, current);

        current.remove(current.size() - 1);
        generateSubsets(n, idx + 1, current);
    }

    public static void main(String[] args) {
        int n = 3;
        ArrayList<Integer> current = new ArrayList<>();
        generateSubsets(n, 1, current);
    }
}

