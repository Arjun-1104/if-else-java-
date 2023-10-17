import java.util.*;
public class Company_Hiring{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();
        System.out.print("Enter gender(M/F): ");
        char gender = sc.next().charAt(0);
        System.out.print("Enter status(M/U): ");
        char status = sc.next().charAt(0);

        if(status == 'm' || status == 'M'){
            System.out.println("You are Hired");
        }
        else if((gender == 'm' || gender == 'M') && age > 30){
                System.out.println("You are Hired");
        }
        else if((gender == 'f' || gender == 'F') && age > 25){
                System.out.println("You are Hired");
        }
        else{
            System.out.println("You are not Hired");
        }
    }
}