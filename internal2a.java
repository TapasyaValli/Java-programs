import java.util.*;
public class internal2a {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        int originalNum=num;
        while(num!=0){
            int digit=num%10;
            sum+=digit*digit*digit;
            num/=10;
        }
        if(sum==originalNum){
            System.out.println(originalNum+" is an Armstrong number");
        }
        else{
            System.out.println(originalNum+" is not an Armstrong number");
        }
        sc.close();
    }
    
}
