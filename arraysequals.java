//tow array are equals or not.
import java.util.*;
public class arraysequals {
    private static boolean  isTwoArraysEquals(int [] array1 , int[] array2 , int l1 , int l2){

        // if (l1!=l2) {

        //     return false;
            
        // }

        for(int i=0;i<l2;i++){

            if(array1[i]!=array2[i])
{
       return false;   // early exit
}        

}

return true;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enther the size of array 1");

        int size1= sc.nextInt();

        int [] array1= new int[size1];

        System.out.println("Enter the size of arrayy2 ");

        int size2 = sc.nextInt();

        int [] array2 = new int[size2];

        System.out.println();

          if(size1!=size2){
            System.out.println("False");
            return ;
             }


        System.out.println("Enter hte elemnts of array 1");


        for(int i=0;i<size1;i++){

            array1[i] = sc.nextInt();

        }
   

        System.out.println();


        System.out.println("Enter the ekentbs of aarray2");
        for(int i=0;i<size2;i++){

            array2[i]= sc.nextInt();

        }

      


       boolean check= isTwoArraysEquals(array1  , array2 , size1 , size2);  /// function call


       System.out.println(check);




    }
    
}
