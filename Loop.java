//Qustion=print hello world 5 times.
// public class Main{
//     public static void main(String[] args){
//         for(int i=1;i<=5;i++){
//             System.out.println("Hello world");
//         }
//     }
// }
//Qustion=print the number from 0 to 9.
// public class Main{
//     public static void main(String[] args){
//         for(int i=10;i>=0;i--){
//             System.out.print(i+" ");
//         }
//     }
// }

// public class Main{
// public static void main(String[] args){
//     System.out.println("Hello world");
// }
// }

// public class Main{
// public static void main(String[] args){
//     // int i=0;
//     // while(i<=10){
//     //     System.out.println(i);
//     //     i++;
//     // }
//     // for(int i=0;i<=10;i++){
//     // System.out.println(i);
//     // }
//     int i=0;
//     do{
//         System.out.println(i);
//         i++;
//     }while(i<=10);
//  }
//  }
//Qustion=print the sum of first n natural numbers.
// import java.util.Scanner;

// public class Main{
//     public static void main(String[] args){
//     Scanner input=new Scanner(System.in);
//     System.out.print("enter the value of n:");
//     int n=input.nextInt();
//     int sum=0;
//     for(int i=1;i<=n;i++){
//         sum=sum+i;
//     }
//     System.out.println(sum);
//     }   
// } 
//Qustion=print the table of a number input by the user.
// import java.util.Scanner;

// public class Main{
//     public static void main(String[] args){
//     Scanner input=new Scanner(System.in);
//     System.out.print("enter the value of n:");
//     int n=input.nextInt();
//     for(int i=1;i<=10;i++){
//         System.out.println(n+"x"+i+"="+n*i);   
//     }
//     }   
// }
import java.util.Scanner; 
public class Loop{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int number=sc.nextInt();
        boolean isprime=true;
        if(number<=1){
            isprime=false;   
        }else{
            for(int i=2;i<Math.sqrt(number);i++){
                if(number%i==0){
                    isprime=false;
                    break;
                }
            }
        }
        if(isprime){
            System.out.println(number+" "+"is prime");
        }else{
            System.out.println(number+" "+"is not prime");
        }
    }
}
