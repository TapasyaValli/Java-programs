import java.util.*;
public class internal9a {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        
        boolean[] letters=new boolean[26];
        int index;
        for(int i=0;i<str.length();i++){
            char ch= str.charAt(i);
            if(ch>='a' && ch<='z'){
                index=ch-'a';
                letters[index]=true;
            }
        }
        boolean isPangram=true;
        for(int j=0;j<26;j++){
            if(!letters[j]){
                isPangram=false;
                break;
            }
        }
        if(isPangram){
            System.out.println("The string is a pangram");
        }
            else{
                System.out.println("The string is not a pangram");
            }
            sc.close();
    }
}

