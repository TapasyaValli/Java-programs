import java.util.*;


class internal1b
{
	public static void main (String[] args) 
	{
		// your code goes here
		        HashMap<Integer, String> hashMap = new HashMap<>();

        // Insert 5 records
        hashMap.put(101, "Siri");
        hashMap.put(102, "Pavani");
        hashMap.put(103, "Ravi");
        hashMap.put(104, "Anil");
        hashMap.put(105, "Neha");

        // Display using entrySet() and Iterator
        System.out.println("HashMap Student Records:");
        Iterator<Map.Entry<Integer, String>> it1 = hashMap.entrySet().iterator();

        while (it1.hasNext()) {
            Map.Entry<Integer, String> entry = it1.next();
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        // ----------- TREEMAP -----------
        TreeMap<Integer, String> treeMap = new TreeMap<>(hashMap);
        // Display using entrySet() and Iterator
        System.out.println("\nTreeMap Student Records:");
        Iterator<Map.Entry<Integer, String>> it2 = treeMap.entrySet().iterator();

        while (it2.hasNext()) {
            Map.Entry<Integer, String> entry = it2.next();
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }


	}
}