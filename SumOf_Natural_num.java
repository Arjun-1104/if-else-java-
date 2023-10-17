import java.util.*;

public class SumOf_Natural_num{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = sc.nextInt(); 
        
        n=(n*(n+1))/2;
        System.out.print("Answer is: "+n);
    }
}