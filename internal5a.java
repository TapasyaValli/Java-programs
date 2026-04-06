import java.util.*;
public class internal5a {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the size of the array:");
         int n=sc.nextInt();
            int[] arr=new int[n];
            System.out.println("Enter the elements of the array:");
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
             }
             HashSet<Integer> set=new HashSet<>();
             for(int i=0;i<n;i++){
                 set.add(arr[i]);
             }
             System.out.println("Unique elements in the array:");
             for(int element : set){
                 System.out.print(element + " ");
             }

                sc.close();
        }
    }
    

