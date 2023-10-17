import java.util.*;

public class Basic_Salary{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the salary: ");
        int salary = sc.nextInt();

            if(salary<=10000){
                System.out.println(2*salary);
            }
            else if(salary<=20000){
                System.out.println(2.15*salary);
            }
            else{
            System.out.println(2.25*salary);
        }
    }
}