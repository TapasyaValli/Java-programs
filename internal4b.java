import java.util.ArrayList;
import java.util.Iterator;

public class internal4b {
    public static void main(String[] args) {
        ArrayList<Integer>n=new ArrayList<>();
        n.add(10);
        n.add(20);
        n.add(30);
        n.add(40);

        System.out.println("ArrayList Elements:");
        Iterator<Integer> it = n.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
    
}
