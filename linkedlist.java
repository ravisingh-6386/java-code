// public class linkedlist {
//     class Node{
//         String data;
//         Node next;
//         Node(String data){
//             this.data=data;
//             this.next=null;

//         }

//     }

//     //add first ,last
//     public void addFirst(String data){
//         Node newNode=new Node(data);
//         if(head==null){
//             head=newNode;
//             return;
//         }
//         newNode.next=head;
//         head=newNode;
//     }
//     //add in last.
//     public void addLast(String data){
//         Node newNode=new Node(data);
//         if(head==null){
//             head=newNode;
//             return;
//         }
//        Node currNode=head;
//        while(currNode.next!=null){
//         currNode=currNode.next;
//        }
//        currNode.next=newNode;
//     }
//     public void printList(){
//         Node currNode=head;
//         while(currNode=head;
//         currNode=currNode.next;
//     }

//     public static void main(String[] args){
//         linkedlist list=new linkedlist();



//     }
// }
// class Node {
//     int data;
//     Node next;
    
//     Node(int data) {
//         this.data = data;
//         this.next = null;
        
//     }
// }

// class LinkedListCustom {
//     Node head;

//     //1) Insert at the end
//     public void insert(int data) {
//         Node newNode = new Node(data);
//         if (head == null) {
//             head = newNode;
//             return;
//         }
//         Node temp = head;
//         while (temp.next != null) {
//             temp = temp.next;
//         }
//         temp.next = newNode;
//     }

//     // 2)Insert at the beginning
//     public void insertAtBeginning(int data) {
//         Node newNode = new Node(data);
//         newNode.next = head;
//         head = newNode;
//     }

//     // 3)Insert at a specific position
//     public void insertAtPosition(int index, int data) {
//         if (index == 0) {
//             insertAtBeginning(data);
//             return;
//         }
//         Node newNode = new Node(data);
//         Node temp = head;
//         for (int i = 0; i < index - 1 && temp != null; i++) {
//             temp = temp.next;
//         }
//         if (temp == null) return;
//         newNode.next = temp.next;
//         temp.next = newNode;
//     }
//     // Delete at beginning
//     public void deleteAtBeginning() {
//         if (head == null){
//             return;
//         } 
     
//         head = head.next;
//     }

//     // Delete at end
//     public void deleteAtEnd() {
//         if (head == null) return;
//          // empty list
//         if (head.next == null) {
//             head = null; // only one element
//             return;
//         }
//         Node temp = head;
//         while (temp.next.next != null) {
//             temp = temp.next;
//         }
//         temp.next = null;
//     }

//     // Delete at specific position
//     public void deleteAtPosition(int index) {
//         if (head == null) return; // empty list
//         if (index == 0) {
//             deleteAtBeginning();
//             return;
//         }
//         Node temp = head;
//         for (int i = 0; i < index - 1 && temp != null; i++) {
//             temp = temp.next;
//         }
//         if (temp == null || temp.next == null) return; // index out of bounds
//         temp.next = temp.next.next;
//     }
// ///////////////////////////////////////////////////
//     public void display() {
//         Node temp = head;
//         while (temp != null) {
//             System.out.print(temp.data + " -> ");
//             temp = temp.next;
//         }
//         System.out.println("null");
//     }
// }

// public class linkedlist {
//     public static void main(String[] args) {
//         LinkedListCustom list = new LinkedListCustom();
//         list.insert(10);
//         list.insert(20);
//         list.insertAtBeginning(5);
//         list.insertAtPosition(1, 15);
//         list.display(); 
//         // Delete operations
//         list.deleteAtBeginning();
//         System.out.println("After deleting at beginning:");
//         list.display(); // 15 -> 10 -> 20 -> null

//         list.deleteAtEnd();
//         System.out.println("After deleting at end:");
//         list.display(); // 15 -> 10 -> null

//         list.deleteAtPosition(1);
//         System.out.println("After deleting at position 1:");
//         list.display(); // 15 -> null
//     }
// }
// import java.util.*;
// class LL
// {
//     public static void main(String[] args){
//         LinkedList<String>list=new LinkedList<String>();
//         list.addFirst("a");
//         list.addFirst("b");
//         System.out.println(list);

//         list.addLast("c");
//         System.out.println(list);

//         System.out.println(list.size());

//         for(int i=0;i<list.size();i++){
//             System.out.print(list.get(i)+"->");
//         }
//         System.out.println("null");

//         // list.removeFirst();
//         // System.out.println(list);

//         // list.removeLast();
//         // System.out.println(list);

//         list.remove(2);
//         System.out.println(list);

//     }
// }

// Reverse the linkedlist.
/*import java.util.*;
public class linkedlist{
    public static void main(String[] args) {
        LinkedList<Integer>list=new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+"->");
        }
        System.out.println("null");
        Collections.reverse(list);
        System.out.println(list);
        
    }
}*/
/*import java.util.*;
public class linkedlist{
    public static void main(String[] args) {
     LinkedList<Integer>list= new LinkedList<>(); 
     list.add(1);
     list.add(2);
     list.add(3);
     list.add(4);
     System.out.println("orginal list:"+list);

    LinkedList<Integer>reversed= new LinkedList<>(); 
    for(int i=list.size()-1;i>=0;i--){
        reversed.add(list.get(i));
    }
    System.out.println("Reversed list:"+reversed);
    
    }
}*/

/*1)Make a Linked List & add the following elements to it : (1, 5, 7, 3 , 8, 2, 3).
 Search for the number 7 & display its index.*/
// import java.util.*;
// public class linkedlist{
//     public static void main(String[] args) {
//         LinkedList<Integer>list=new LinkedList<Integer>();
//         list.add(1);
//         list.add(5);
//         list.add(7);
//         list.add(3);
//         list.add(8);
//         list.add(2);
//         list.add(3);

//         int index=list.indexOf(7);
//         if(index!=-1){
//             System.out.println("number 7 found at index is:"+index);
//         }else{
//             System.out.println("number not found");
            
//         }

//         for(int i=0;i<list.size();i++){
//             System.out.print(list.get(i)+"->");
//         }
//         System.out.println("null");
        
//     }
// }

/*2)Take elements(numbers in the range of 1-50) of a Linked List as input from the user. 
Delete all nodes which have values greater than 25.*/
// import java.util.*;
// public class linkedlist{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);

        
//     }
// }
//Qustion=reversed the linkedlist.
/*class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class linkedlist {
    Node head;

    // Add node at end
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Reverse the linked list
    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    // Print list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        linkedlist list = new linkedlist();
        list.add(1);
        list.add(5);
        list.add(7);
        list.add(3);
        list.add(8);
        list.add(2);
        list.add(3);

        System.out.print("Original List: ");
        list.printList();

        list.reverse();

        System.out.print("Reversed List: ");
        list.printList();
    }
}*/

/*Important qustion of linkedlist */
/*Qustion=find and delete the nth node from the end of linkedlist. */

// import java.util.*;
// public class linkedlist{
//     public static void main(String[] args) {
//      LinkedList<Integer>list= new LinkedList<>(); 
//      list.add(1);
//      list.add(2);
//      list.add(2);
//      list.add(1);
//      System.out.println("original list:"+list);

//     LinkedList<Integer>reversed= new LinkedList<>(); 
//     for(int i=list.size()-1;i>=0;i--){
//         reversed.add(list.get(i));
//     }
//     System.out.println("Reversed list:"+reversed);
//     if(list.equals(reversed)){
//         System.out.println("it is plaindrom");
//     }else{
//         System.out.println("it is not a plaindrom");
//     }
    
//     }
// }
/*  Qustion 1.reversed the linkedlist and plaindrome */
/*import java.util.*;
public class linkedlist{
    public static void main(String[] args) {
        LinkedList<Integer>list=new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(1);

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+"->");
        }
        System.out.println("null");
        LinkedList<Integer>reversedList=new LinkedList<>(list);
        Collections.reverse(reversedList);
        System.out.println(reversedList);

        
        if(list.equals(reversedList)){
            System.out.println("it is plaindrom and True");
        }else{
            System.out.println("it is not palindrom and false");
        }
        
    }
}*/

