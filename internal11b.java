abstract class Shape{
    abstract void area();
}
class Circle extends Shape{
    void area(){
        int r =2;
        System.out.println("Circle"+(3.14*r*r));
    }
}
class Rectangle extends Shape{
    void area(){
        int l=4,b=5;
        System.out.println("Rectangle"+(l*b));
    }
}

public class internal11b {
    public static void main(String[] args){
        Circle c=new Circle();
        Rectangle r=new Rectangle();
        c.area();
        r.area();
    }
    
}
