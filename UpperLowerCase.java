import java.util.Scanner;

public class UpperLowerCase {
    public static void main(String[] args){
        System.out.println("Enter any character: ");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        if(ch>='a' && ch<='z'){
            System.out.println("Lower case");
        }
        else if(ch>='A' && ch<='Z'){
            System.out.println("Upper case");
        }
        else{
            System.out.println("Other character");
        }
    }
}
