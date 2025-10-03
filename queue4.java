//queue representation using array.(fixed size).

// public class queue4 {
//     static class queue{
//         static int arr[];
//         static int size;
//         static int rear=-1;

//         queue(int n){
//             arr=new int[n];
//             this.size=n;
//         }
//         public static boolean isEmpty(){ ///first condition is empty or not .
//             return rear==-1;
//         }
//         //enque(add).
//         public static void add(int data){
//             if(rear==size-1){ //rear is last index.
//                 System.out.println("full queue");
//                 return;
//             }
//             rear++;
//             arr[rear]=data;
//         }

//         //dequeue(remove).time=O(n)
//         public static int remove(){
//             if(isEmpty()){
//                 System.out.println("Empty queue");
//                 return -1;
//             }
//             int front=arr[0];
//             for(int i=0;i<rear;i++){
//                 arr[i]=arr[i+1];
//             }
//             rear--;
//             return front;

//         }
//         //peek
//         public static int peek(){
//             if(isEmpty()){
//                 System.out.println("Empty queue");
//                 return -1;
//             }
//             return arr[0];

//         }

//         }
//     public static void main(String[] args) {
//         queue q=new queue(5);
//         q.add(1);
//         q.add(2);
//         q.add(3);

//         while(!q.isEmpty()){
//             System.out.println(q.peek());
//             q.remove();

//         }   
//     }
// }

/// circular queue.
// public class queue4 {
//     static class queue{
//         static int arr[];
//         static int size;
//         static int rear=-1;
//         static int front=-1;

//         queue(int n){
//             arr=new int[n];
//             this.size=n;
//         }

//         public static boolean isEmpty(){ ///first condition is empty or not .
//             return rear==-1 && front==-1;
//         }
//         public static boolean ifFull(){
//             return (rear+1)%size==front;
//         }
//         public static void add(int data){
//             if(isFull()){
//                 System.out.println("overflow");
//                 return;
//             }
//             if(front==-1){
//                 front=0;
//             }
//             rear=(rear+1)%size;
//             arr[rear]=data;
//         }
//         public static int remove(){
//             if(isEmpty()){
//                 System.out.println("Empty queue");
//                 return -1;
//             }
//             // single element condition.
//             int result=arr[front];
//             if(rear==front){
//                 rear=front=-1;
//             }else{
//                 front=(front+1)%size;
//             }
//             return result;

//          }
//         //peek
//         public static int peek(){
//             if(isEmpty()){
//                 System.out.println("Empty queue");
//                 return -1;
//             }
//             return arr[front];
//         }

//         }
//     public static void main(String[] args) {
//         queue q=new queue(5);
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         q.add(5);
//         System.out.println(q.remove());
//         q.add(6);
//         System.out.println(q.remove());
//         q.add(7);

//         while(!q.isEmpty()){
//             System.out.println(q.peek());
//             q.remove();

//             while(!q.isEmpty()){
//                 System.out.println(q.peek());
//                 q.remove();
//             }

//         }   
//     }
// }

// public class queue4 {
//     static class Queue {
//         static int arr[];
//         static int size;
//         static int rear = -1;
//         static int front = -1;

//         Queue(int n) {
//             arr = new int[n];
//             this.size = n;
//         }

//         public static boolean isEmpty() {
//             return rear == -1 && front == -1;
//         }

//         public static boolean isFull() {
//             return (rear + 1) % size == front;
//         }

//         // enqueue (add)
//         public static void add(int data) {
//             if (isFull()) {
//                 System.out.println("Queue Overflow");
//                 return;
//             }
//             if (front == -1) {
//                 front = 0; 
//             }
//             rear = (rear + 1) % size;
//             arr[rear] = data;
//         }

//         // dequeue (remove)
//         public static int remove() {
//             if (isEmpty()) {
//                 System.out.println("Queue Underflow");
//                 return -1;
//             }
//             int result = arr[front];
//             if (rear == front) {
//                 rear = front = -1;
//             } else {
//                 front = (front + 1) % size;
//             }
//             return result;
//         }
//         // peek
//         public static int peek() {
//             if (isEmpty()) {
//                 System.out.println("Queue Empty");
//                 return -1;
//             }
//             return arr[front];
//         }
//     }

//     public static void main(String[] args) {
//         Queue q = new Queue(5);
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         q.add(5);

//         System.out.println(q.remove()); 
//         q.add(6); 
//         System.out.println(q.remove()); 
//         q.add(7); 

//         while (!q.isEmpty()) {
//             System.out.println(q.peek());
//             q.remove(); 
//         }
//     }
// }


// queue using linked list.
// public class queue4 {
//     // Node class
//     static class Node {
//         int data;
//         Node next;

//         Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     // Queue class
//     static class Queue {
//         Node front, rear;

//         Queue() {
//             this.front = this.rear = null;
//         }

//         // check empty
//         public boolean isEmpty() {
//             return front == null;
//         }

//         // enqueue (add element at rear)
//         public void add(int data) {
//             Node newNode = new Node(data);

//             if (rear == null) { // first element
//                 front = rear = newNode;
//                 return;
//             }

//             rear.next = newNode;
//             rear = newNode;
//         }

//         // dequeue (remove from front)
//         public int remove() {
//             if (isEmpty()) {
//                 System.out.println("Queue Underflow");
//                 return -1;
//             }

//             int result = front.data;
//             front = front.next;

//             if (front == null) { // queue becomes empty
//                 rear = null;
//             }

//             return result;
//         }

//         // peek (front element)
//         public int peek() {
//             if (isEmpty()) {
//                 System.out.println("Queue Empty");
//                 return -1;
//             }
//             return front.data;
//         }
//     }

//     public static void main(String[] args) {
//         Queue q = new Queue();
//         q.add(10);
//         q.add(20);
//         q.add(30);

//         System.out.println("Front element: " + q.peek()); // 10

//         System.out.println("Removed: " + q.remove()); // 10
//         System.out.println("Removed: " + q.remove()); // 20

//         q.add(40);
//         System.out.println("Front element: " + q.peek()); // 30

//         while (!q.isEmpty()) {
//             System.out.println(q.remove());
//         }
//     }
// }

/// easy implementation.in java.
// import java.util.*;
// public class queue4 {
   
//     public static void main(String[] args) {
//         //Queue<Integer> q=new LinkedList<>();
//         //or//
//         Queue<Integer> q=new ArrayDeque<>();
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         q.add(5);
       

//         while(!q.isEmpty()){
//             System.out.println(q.peek());
//             q.remove();

//         }   
//     }
// }

// Queue using 2 stack [1)push 2)pop].
import java.util.*;
public class queue4{
    static class Queue{
      static Stack<Integer> s1=new Stack<>();
      static Stack<Integer> s2=new Stack<>();

      public static boolean isEmpty(){
        return s1.isEmpty();
      }

      public static void add(int data){
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        s1.push(data);
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
      }

      public static int remove(){
        if(isEmpty()){
            System.err.println("empty queue");
            return -1;
        }
        return s1.pop();
      }
      public static int peek(){
          if(isEmpty()){
            System.err.println("empty queue");
            return -1;
        }
        return s1.peek();

      }
    }
    public static void main(String[] args) {
        Queue q=new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
         
      while(!q.isEmpty()){
      System.out.println(q.peek());
      q.remove();
       }
        
    }
}

