import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
public class internal5b {
 public static void main(String[] args) {
 // Create a Hashtable
 Hashtable<Integer, String> countries = new Hashtable<>();
 // Insert at least 5 records (ID -> Country Name)
 countries.put(101, "India");
 countries.put(102, "USA");
 countries.put(103, "Japan");
 countries.put(104, "Germany");
 countries.put(105, "Brazil");
 // Display using Iterator and entrySet()
 System.out.println("Country Records in Hashtable:");
 Iterator<Map.Entry<Integer, String>> it = countries.entrySet().iterator();
 while (it.hasNext()) {
 Map.Entry<Integer, String> entry = it.next();
 System.out.println("ID: " + entry.getKey() + ", Country: " + entry.getValue());
 }
 }
}