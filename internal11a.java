class  granparent{
    void showGrandparent(){
        System.out.println("I am a grandparent");
    }
}
class parent1 extends granparent{
    void showParent1(){
        System.out.println("I am a parent1");
    }
}
class child1 extends parent1{
    void showChild1(){
        System.out.println("I am a child1");
    }
}

public class internal11a {
    public static void main(String[] args){
        child1 c=new child1();
        c.showGrandparent();
        c.showParent1();
        c.showChild1();
    }   
    
}
