//Qustion(1)=print the pattern(solid rectangle).
// public class Main{
//     public static void main(String[] args){
//         for(int i=1;i<=4;i++){
//             for(int j=1;j<=5;j++){
//                  System.out.print(" * ");

//             }
//              System.out.println();
//         }
//     }
// }
                //OR
// import java.util.Scanner;                

// public class Main{
//     public static void main(String[] args){
//         Scanner input=new Scanner(System.in);
//         System.out.print("enter the value of n:");
//         int n=input.nextInt();

//         System.out.print("enter the value of m:");
//         int m=input.nextInt();

//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=m;j++){
//                  System.out.print(" * ");

//             }
//              System.out.println();
//         }
//     }
// }                

//Qustion(2)=print the pattern(Hollow rectangle).
// import java.util.Scanner;                

// public class Main{
//     public static void main(String[] args){
//         Scanner input=new Scanner(System.in);
//         System.out.print("enter the value of n:");
//         int n=input.nextInt();

//         System.out.print("enter the value of m:");
//         int m=input.nextInt();

//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=m;j++){
//                 if(i==1 || j==1 || i==n || j==m){
//                     System.out.print(" * ");
//                 }
//                 else {
//                     System.out.print("   ");
//                 }
//             }
//             System.out.println();
//             }
            
//         }
//     }
//Qustion(3)=print the pattern(Half pyramid).
// public class Main{
//     public static void main(String[] args){
//         int n=4;
//         //int m=4;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();

//         }
//     }
// }

// //Qustion(4)=Inverted half pyramid.
// public class Main{
//     public static void main(String[] args){
//         int n=4;
//         //int m=4;
//         for(int i=n;i>=1;i--){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();

//         }
//     }
// }
//Qustion(5)=Inverted half pyramid(rotated by 180 deg).
// public class Main{
//     public static void main(String[] args){
//         int n=4;
//         //int m=4;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();

//         }
//     }
// }

//Qustion(6)=Half pyramid with numbers.
// public class Main{
//     public static void main(String[] args){
//         int n=5;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//         }   
//     }
// }
//Qustion(7)= Inverted Half pyramid with numbers.
// public class Main{
//     public static void main(String[] args){
//         int n=5;
//         for(int i=n;i>=1;i--){
//             for(int j=1;j<=i;j++){
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//         }   
//     }
// }
//Qustion(8)=floyd's Triangle.
// public class Main{
//     public static void main(String[] args){
//         int n=5;
//         int number=1;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(number+" ");
//                 number++;
//             }
//             System.out.println();
//         }   
//     }
// }
//Qustion(9)=0-1 trangle.
// public class Main{
//     public static void main(String[] args){
//         int n=5;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 if((i+j)%2==0){
//                     System.out.print("1 ");
//                 } else{
//                     System.out.print("0 ");
//                 }
//             }
//             System.out.println();
//         }   
//     }
// }
//Qustion(10)=Butterfly pattern.
// public class Main{
//     public static void main(String[] args){
//         int n=5;
// ////////////////////////////////////////////
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }

//             int spaces=2*(n-i);
//             for(int j=1;j<=spaces;j++){
//                 System.out.print(" ");
//             }

//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
// ////////////////////////////////////////
//         for(int i=n;i>=1;i--){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }

//             int spaces=2*(n-i);
//             for(int j=1;j<=spaces;j++){
//                 System.out.print(" ");
//             }

//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//     }
// }
// }

//Qustion(11)=Solid Rhombus.
// public class Main{
//     public static void main(String[] args){
//         int n=5;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=5;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
// //     }
// // }

// //Qustion(12)=Number pyramid.
// public class Main{
//     public static void main(String[] args){
//       int n=5;
//       for(int i=1;i<=n;i++){
//         for(int j=1;j<=n-i;j++){
//             System.out.print(" ");
//         }
//         for(int  j=1;j<=i;j++){
//             System.out.print(i+" ");
//         }
//         System.out.println();

//       }  
//     }
// }
//Qustion(13)=Palindromic pattern.
// public class Main{
//     public static void main(String[] args){
//       int n=5;
//       for(int i=1;i<=n;i++){
//         for(int j=1;j<=n-i;j++){
//             System.out.print(" ");
//         }
//         for(int  j=i;j>=1;j--){
//             System.out.print(j+"");
//         }
//         for(int j=2;j<=i;j++){
//             System.out.print(j+"");
//         }
//         System.out.println();

//       }  
//     }
// }
//Qustion(14)=Diamond pattern.
//  public class Main{
//     public static void main(String[] args){
//       int n=4;
//       for(int i=1;i<=n;i++){
//         for(int j=1;j<=n-i;j++){
//             System.out.print(" ");
//         }
//         for(int  j=1;j<=2*i-1;j++){
//             System.out.print("*");
//         }
//         System.out.println();
//       }  

//       /////////////////////////////////////////
//       for(int i=n;i>=1;i--){
//         for(int j=1;j<=n-i;j++){
//             System.out.print(" ");
//         }
//         for(int  j=1;j<=2*i-1;j++){
//             System.out.print("*");
//         }
//         System.out.println();
//       }  
//     }
// }


