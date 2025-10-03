// class pen{
//     String color;
//     String type;
//     public void write(){
//         System.out.println("write something");
//     }
//     public void printColor(){
//         System.out.println(this.color);
//     }
//     public void printType(){
//         System.out.println(this.type);
//     }
// }
// class Student{
//     String name;
//     int age;
//     float cgpa;
     
//     public void printInfo(){
//         System.out.println(this.name);
//         System.out.println(this.age);
//         System.out.println(this.cgpa);
//     }
//     Student(String name,int age,float cgpa){
//         this.name=name;
//         this.age=age;
//         this.cgpa=cgpa;
//     }
//     Student(Student s){
//         this.name=s.name;
//         this.age=s.age;
//         this.cgpa=s.cgpa;
//     }
//     public void printInfo(String name){
//         System.out.println(name);
//     }
//     public void printInfo(int age){
//         System.out.println(age);
//     }
//     public void printInfo(float cgpa){
//         System.out.println(cgpa);
//     }
//     public void printInfo(String name,int age,float cgpa){
//         System.out.println(name+" "+age+" "+cgpa);
//     }

// }

// public class oop { 
//     public static void main(String[] args) {
       
//         Student s1=new Student("Ravi Singh",20,9.0f);
//         // s1.name="Ravi Singh";
//         // s1.age=20;
//         // s1.cgpa=9.0f;
//         Student s2=new Student(s1);
//         System.out.println(s2.name+" "+s2.age+" "+s2.cgpa);

//         s1.printInfo();
//         s1.printInfo(s1.name);
//         s1.printInfo(s1.age);
//         s1.printInfo(s1.cgpa);

//     }   
// }
//4)Abstraction.
// abstract class Animal{
//     abstract void walk();

//     }

// class Horse extends Animal{
//     public void walk(){
//         System.out.println("Walks on 4 legs");
//     }
// }
// class Chicken extends Animal{
//     public void walk(){
//         System.out.println("walks on 2 legs");
//     }
// } 
// public class oop{
//     public static void main(String[] args){
//         Horse horse=new Horse();
//         horse.walk();

//     }
// }

//Interface.
// interface Animal{
//     int eyes=2;
//     void walk();
// }
// interface Herbivore{

// }
// class Horse implements Animal,Herbivore {
//     public void walk(){
//     System.out.println("walks on 4 legs");
// }
// }

class Student {
    String name;
    static String school;

    public static void changeSchool(){
        school="newSchool";
    }


}
public class oop{
    public static void main(String[] args){
       Student.school="RVC";
       Student student1=new Student();
       student1.name="Ravi";
       System.out.println("School name:"+student1.school);
       System.out.println("Student name:"+student1.name);

    }
}