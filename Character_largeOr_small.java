import java.util.*;

public class Character_largeOr_small{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any character: ");
        char ch = sc.next().charAt(0);
        if(ch>='a' && ch<='z'){
            System.out.print("Character is Small");
        }
        else if(ch>='A' && ch<='Z'){
            System.out.print("Character is Alphabet");
        }
        else{
            System.out.print("Invalid character");
        }
    }
}