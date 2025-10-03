// // import java.util.*;
// // public class stack{
// //     public static void main(String[] args){
// //         Stack<Integer> stack=new  Stack<>();
// //         stack.push(10);
// //         stack.push(20);
// //         stack.push(30);
// //        for(int i=stack.size()-1;i>=0;i--){
// //         System.out.println(stack.get(i));
// //        }
// //         // System.out.println(stack);
// //         // System.out.println(stack.peek());
// //         // System.out.println(stack.pop());
// //         // System.out.println(stack.size());
// //         // System.out.println(stack.isEmpty());
// //         // stack.remove(1);
// //         // System.out.println(stack);
// //     }
// // }

// // stack using linkedlist.
// class stackLinkedList{
//     private class Node{
//         int data;
//         Node next;
//     }
//     private Node top;
//     public stackLinkedList(){
//         top=null;
//     }
//     //push using.
//     public void push(int data){
//         Node newNode=new Node();
//         newNode.data=data;
//         newNode.next=top;
//         top=newNode;
//     }
//     public int pop(){
//     if(top==null){
//         System.out.println("stack underflow");
//         return -1;
//     }
//     int popped=top.data;
//     top=top.next;
//     return popped;
//     }
//     public int peek(){
//         if(top==null){
//             System.out.println("stack is empty");
//             return -1;
//         }
//         return top.data;
//     }
//     public boolean isEmpty(){
//         return top==null;
//     }
//     public void printStack(){
//         Node temp=top;
//         while(temp!=null){
//             System.out.println(temp.data+"");
//             temp=temp.next;
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         stackLinkedList s=new stackLinkedList();
//         s.push(10);
//         s.push(20);
//         s.push(30);
//         s.push(40);
//         s.printStack();
//         System.out.println("Peek:"+s.peek());
//         System.out.println("Pop:"+s.pop());
//         s.printStack();
//     }
// }

// using java fram work.
// import java.util.*;
// public class stack{
//     public static void main(String[] args) {
//         Stack<Integer> s=new Stack<>();
//         s.push(10);
//         s.push(20);
//         s.push(30);
//         s.push(40);
//         while(!s.isEmpty()){
//             System.out.println(s.peek());
//             s.pop();
//         }
//     }
// }
//qustion=push at the bottom of stack.
// import java.util.*;
// public class stack{
//     public static void pushBottom(int data,Stack<Integer> s){
//         if(s.isEmpty()){
//             s.push(data);
//             return ;
//         }
//         int top=s.pop();
//         pushBottom(data, s);
//         s.push(top);

//     }
//     public static void main(String[] args) {
//         Stack<Integer> s=new Stack<>();
//         s.push(10);
//         s.push(20);
//         s.push(30);

//         pushBottom(40, s);
        
//         while(!s.isEmpty()){
//             System.out.println(s.peek());
//             s.pop();
//         }
//     }
// }
//qustion=reverse the stack.
/*import java.util.*;
public class stack{
    public static void pushBottom(int data,Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return ;
        }
        int top=s.pop();
        pushBottom(data, s);
        s.push(top);

    }
    public static void reverse(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top=s.pop();
        reverse(s);
        pushBottom(top, s);
    }
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);

        reverse(s);
        
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}*/