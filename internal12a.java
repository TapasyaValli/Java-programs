interface A{
    void showA();
}
interface B{
    void showB();
}
class C implements A,B{
    public void showA(){
        System.out.println("This is interface A");
    }
    public void showB(){
        System.out.println("This is interface B");
    }
}





public class internal12a {
    public static void main(String[] args){
        C c=new C();
        c.showA();
        c.showB();
    }
}
