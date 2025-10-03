//Print a given name in a function.
// import java.util.Scanner;

// public class Function{
//     public static void printMyName(String name){
//         System.out.print(name);
//         return;
//     }
//     public static void main(String[] args){
//         Scanner input=new Scanner(System.in);
//         System.out.print("enter the name:");
//         String name=input.nextLine();
//         printMyName(name); ///////function call/////
//     }
// }

// //Make a function to add 2 numbers and return the sum.
// import java.util.Scanner;

// public class Main{
//     public static void 

// }

// import java.util.Scanner;

// public class atomic {
//     // Function to add two numbers
//     public static int add(int a, int b) {
//         return a + b;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter first number: ");
//         int num1 = sc.nextInt();

//         System.out.print("Enter second number: ");
//         int num2 = sc.nextInt();

//         int sum = add(num1, num2);
//         System.out.println("Sum: " + sum);

//         sc.close();
//     }
// }

// import java.util.Scanner;

// public class atomic{
//         public static void printMyName(String name){
//             System.out.println(name);
//             return ;

//         }
//         public static void main(String[] args){
//         Scanner SC=new Scanner(System.in);
//         System.out.print("Enter the your name:");
//         String name=SC.next();

//         printMyName(name);

//     }
// }

//Qustion 3=make a function to multiply 2 numbers and return the product.
// import java.util.Scanner;

// public class atomic{
//     public static int  printMultiply(int a, int b){
//         return a*b;
//     }
//     public static void main(String[] args){
//         Scanner SC=new Scanner(System.in);
        
//         System.out.print("enter the value of a:");
//         int num1= SC.nextInt();

//         System.out.print("enter the value of b:");
//         int num2= SC.nextInt();

//         System.out.println("Product of 2 number is :"+printMultiply(num1, num2));

//     }
// }

//find the factorial of a number.
// import java.util.Scanner;

// public class atomic{
//     public static void printFactorial(int n){
//         int factorial=1;
//         for(int i=n;i>=1;i--){
//             factorial=factorial*i;
//         }
//         System.out.println(factorial);
//         return;
//     }
//     public static void main(String[] args) {
//         Scanner SC=new Scanner(System.in);
//         System.out.print("Enter the value of n:");
//         int n=SC.nextInt();
//         printFactorial(n);
//     }
// }

// Homework Problems .
// 1)Make a function to check if a number is prime or not.
// public class atomic {
//     public static boolean isPrime(int number) {
//         if (number <= 1) {
//             return false;
//         }

//         for (int i = 2; i <= Math.sqrt(number); i++) {
//             if (number % i == 0) {
//                 return false; 
//             }
//         }

//         return true; 
//     }

//     public static void main(String[] args) {
//         int num = 29; 

//         if (isPrime(num)) {
//             System.out.println(num + " is a prime number.");
//         } else {
//             System.out.println(num + " is not a prime number.");
//         }
//     }
// }

// 2)Make a function to check if a given number n is even or not.
// import java.util.Scanner;

// public class atomic{
//     public static void printNumber(int n){
//         if(n%2==0){
//             System.out.println("even number");
//         } else{
//             System.out.println("odd number");
//         }
//         return;
//     }
//     public static void main(String[] args) {
//         Scanner SC=new Scanner(System.in);
//         System.out.print("Enter the value of n:");
//         int n=SC.nextInt();
//         printNumber(n);
//     }
// }
// 3)Make a function to print the table of a given number n.
// import java.util.Scanner;

// public class atomic{
//     public static void printTable(int n){
//         for(int i=1;i<=10;i++){
//             System.out.println(n*i);
//         }
//         return;
//     }
//     public static void main(String[] args) {
//         Scanner SC=new Scanner(System.in);
//         System.out.print("Enter the value of n:");
//         int n=SC.nextInt();
//         printTable(n);
//     }
// }

// 1)Enter 3 numbers from the user & make a function to print their average.
// 2)Write a function to print the sum of all odd numbers from 1 to n.
// 3)Write a function which takes in 2 numbers and returns the greater of those two.
// 4)Write a function that takes in the radius as input and returns the circumference of a circle.
// 5)Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
// 6)Write an infinite loop using do while condition.
// 7)Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 
// 8)Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.
// 9_Write a function that calculates the Greatest Common Divisor of 2 numbers. (BONUS)
// 10)Write a program to print Fibonacci series of n terms where n is input by user :
// 0 1 1 2 3 5 8 13 21 ..... 
// In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.
// (BONUS)