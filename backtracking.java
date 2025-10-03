// /* time complixity is O(n*n!) */

// /*public class backtracking {
//     public static void printPermutation(String str,String perm,int idx){
//         if(str.length()==0){
//             System.out.println(perm);
//             return;
//         }
//         for(int i=0;i<str.length();i++){
//             char currChar=str.charAt(i);
//             String newStr=str.substring(0,i)+str.substring(i+1);

//             printPermutation(newStr, perm+currChar, idx);
//         }

//     }
//     public static void main(String[] args){
//         String str="ABC";
//         printPermutation(str, "", 0);
//     }
    
// }*/
// /* Qustion=N-Queens  and time complixity is 0(n^n) */
// import java.util.*;

// public class backtracking {
//     static int n;
//     static int solutions = 0;
//     static int[] pos; 

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter n: ");
//         n = sc.nextInt();
//         sc.close();

//         pos = new int[n];
//         solve(0);
//         System.out.println("Total solutions: " + solutions);
//     }

//     static void solve(int row) {
//         if (row == n) {
//             printBoard();
//             solutions++;
//             return;
//         }
//         for (int col = 0; col < n; col++) {
//             if (isSafe(row, col)) {
//                 pos[row] = col;
//                 solve(row + 1);
//             }
//         }
//     }

//     static boolean isSafe(int row, int col) {
//         for (int prevRow = 0; prevRow < row; prevRow++) {
//             int prevCol = pos[prevRow];
//             // same column
//             if (prevCol == col) return false;
//             // same diagonal
//             if (Math.abs(prevCol - col) == Math.abs(prevRow - row)) return false;
//         }
//         return true;
//     }

//     static void printBoard() {
//         System.out.println("Solution " + (solutions + 1) + ":");
//         for (int r = 0; r < n; r++) {
//             for (int c = 0; c < n; c++) {
//                 if (pos[r] == c) System.out.print("Q ");
//                 else System.out.print(". ");
//             }
//             System.out.println();
//         }
//         System.out.println();
//     }
// }
