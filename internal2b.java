import java.util.*;

public class internal2b {
    public static void main(String[] args) {

        // ----------- HASHSET -----------
        HashSet<String> hashSet = new HashSet<>();

        // Insert elements
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Mango");
        hashSet.add("Orange");
        hashSet.add("Grapes");

        // Display using Iterator
        System.out.println("HashSet Elements (no particular order):");
        Iterator<String> it1 = hashSet.iterator();
        while (it1.hasNext()) {
            System.out.println(it1.next());
        }

        // ----------- TREESET -----------
        TreeSet<String> treeSet = new TreeSet<>(hashSet);

        // Display using Iterator
        System.out.println("\nTreeSet Elements (sorted order):");
        Iterator<String> it2 = treeSet.iterator();
        while (it2.hasNext()) {
            System.out.println(it2.next());
        }
    }
}