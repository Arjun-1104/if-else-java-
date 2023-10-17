import java.util.*;

public class Positive_Negative{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = sc.nextInt();

        if(n==0){
            System.out.println("Zero");
        }
        else if(n%2==0){
            System.out.println("Positive");
        }
        else{
            System.out.println("Negative");
        } 
    }
}