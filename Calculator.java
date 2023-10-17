import java.util.*;
public class Calculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int ans;

        System.out.print("Enter value of a : ");
        int a=sc.nextInt();
        System.out.print("Enter value of b : ");
        int b=sc.nextInt();
        System.out.print("Enter given operator(+,-,*,/) : ");
        char ch=sc.next().charAt(0);
    
        if(ch=='+'){
            ans = a+b;
            System.out.println("Addition is: "+ans);
        }
        else if(ch=='-'){
            ans = a-b;
            System.out.println("Substraction is: "+ans);
        }
        else if(ch=='*'){
            ans = a*b;
            System.out.println("Multiplication is: "+ans);
        }
        else if(ch=='/'){
            ans = a/b;
            System.out.println("Division is: "+ans);
        }
        else{
            System.out.println("Invalid Operator");
        }
    }
}