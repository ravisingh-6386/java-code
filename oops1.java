/////////oops////////
public class oops1{
    public static void main(String[] args) {
        Shape s=new Shape();
        s.area();

        Triangle t=new Triangle();
        t.area(10,5);

        EquilaterialTriangle e=new EquilaterialTriangle();
        e.area(10,5);

    }
}
/// Single level inheritance
       class Shape{  
    public void area(){
        System.out.println("area");
    }
}
class Triangle{
    public void area(int b,int h){
        System.out.println(0.5*b*h);
    }
}
/////Multi level inheritance.
class EquilaterialTriangle{
    public void area(int b,int h){
        System.out.println(0.5*b*h);
    }
} 

