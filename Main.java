import java.util.*;
public class Main {
    public static void main(String[] args) {
/*
        int a = 30;
        int b = 30;

        if(a>b){
            System.out.println("a is greater than b");
        }
        else if(a<b){
            System.out.println("b is greater than a");
        }
        else{
            System.out.println("Both are same");
        }

public class Main {
    public static void main(String[] args) {
        //find area and peramerter who is greater
        int length = 10;
        int width = 15;

        int perameter = 2 * (length + width);
        int area = length * width;

        if (area > perameter) {
            System.out.println("Area is  : " + area);
        } else {
            System.out.println("Perameter is  : " + perameter);
        }
    }}

     // Find evenand odd

     int n = 7;
        if(n%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }

     //4.  Tringle valid or non-valid


        int a1 = 90;
        int a2 = 45;
        int a3 = 45;

        int sum = a1+ a2+ a3;

        if(sum == 180){
            System.out.println("Vaild");
        }
        else{
            System.out.println("Invalid");
        }



    //5.

    int n = 14;
    if(n == 1){
        System.out.println("Jan");
    } else if(n == 2){
        System.out.println("Fab");
    } else if (n == 3) {
        System.out.println("Mar");
    } else if (n == 4) {
        System.out.println("Apr");
    } else if (n == 5) {
        System.out.println("May");
    } else if (n == 6) {
        System.out.println("Jun");
    } else if (n == 7) {
        System.out.println("Jul");
    } else if (n == 8) {
        System.out.println("Aug");
    }else if (n == 9){
        System.out.println("Sep");
    } else if (n == 10) {
        System.out.println("Oct");
    } else if (n == 11) {
        System.out.println("Nov");
    } else if (n == 12) {
        System.out.println("Dec");
    }
    else{
        System.out.println("Invalid number");
    }

        // 7.
        int Phy = 90, chy = 80, Bio = 70, Math = 56, computer = 80;
        int sum = Phy + chy + Bio + Math + computer;
        System.out.println("Sum is: " + sum);

        int per = (sum * 100) / 500;
        System.out.println("Percentage is :" + per);

        if (per >= 90) {
            System.out.println("Grade A");
        } else if (per >= 80) {
            System.out.println("Grade B");
        } else if (per >= 70) {
            System.out.println("Grade C");
        } else if (per >= 60) {
            System.out.println("Grade D");
        } else if (per >= 50) {
            System.out.println("Grade E");
        } else {
            System.out.println("Fail");
        }

        //8.
        int a = 15, b =56, c = 7;
        if (a > b) {
            if (a > c) {
                System.out.println("a is greater");
            } else {
                System.out.println("c is greater");
            }
        }
            else{
            if (b > c) {
                System.out.println("b is greater");
            } else {
                System.out.println(" c is greater");
            }
        }
        */
        //
        /*
        int a = 5,b=0,c=5;
        if(a==b) {
            if(a==c){
                System.out.println("equilateral");
        }
            else{
                System.out.println("isoscaler");
            }
        }
        else if (b == c) {
                System.out.println("isoscaler");
            }
        else if(a == c ){
                System.out.println("isoscaler");
            }
        else {
                System.out.println("scaler");
            }

        //
        int a =5,b =5,c =6;
        if((a == b) && (b == c)){
            System.out.println("equilateral");
        }
        else if((a==b) || (b==c) || (a==c)){
            System.out.println("isoscaler");
        }
        else{
            System.out.println("scaler");
        }

        //
        int n =35;
        if((n%5 == 0 ) && (n%7 == 0)){
            System.out.println("The number is multiply of 5 and 7");

        }
        else{
            System.out.println("The number is not multiply of 5 and 7");
        }
        //
        int a = 25 ,b= 25, c =25;
        if(a<b){
            if(a<c){
                System.out.println("a is younger");
            }
            else {
                System.out.println("c is younger");
            }

        }
        else if(b<c){
            System.out.println("b is younger");
        } else {
            System.out.println(" c is younger");

        }

        //r=ram,s=shayam,a=ajay
        int r = 16, s =8,a=17;

        if(r<s && r<a){
            System.out.println("ram chota hai");
        }
        else if(s<r && s<a){
            System.out.println("shayam chota hai");
        }
        else {
            System.out.println("ajay chota hai");
        }


        //
        int a = 8,b =5 ,c =5;
        if(a == b && b==c){
            System.out.println("number is equal");
        }
        else{
            System.out.println("number is not equal");
        }
        //


        int m = 6;
        int year = 2004;

        if(m==1 || m==3 || m==5 || m==7||m==8||m==10||m==12){
            System.out.println("31 Days");
        }
        else if(m==4||m==6||m==9||m==11){
            System.out.println("30 Days");
        }
        else if(m==2 && year%4==0){
            System.out.println("29 days");
        }
        else if(m==2){
            System.out.println(" 28 days");
        }


         
        ///
        int bprize = 20,bquantity = 100,total;
        int ans = bprize * bquantity;

        if (bquantity > 100) {
            int dis = (ans * 10) / 100;
            total = ans - dis;
            System.out.println("Bottle amount is: " + total);
        } else {
            System.out.println("Bottle amount is: " + ans);
        }
        */

       /*
        int steelh=51,tensile=5700;
        double carbon = 0.5;
        if(steelh>50 && carbon<0.7 && tensile>5600){
            System.out.println("grade 10");
        }
        else if(steelh>50 && carbon<0.7){
            System.out.println("grade 9");
        }
        else if(carbon<0.7 && tensile>5600){
            System.out.println("grade 8");
        }
        else if(steelh>50 && tensile>5600){
            System.out.println("grade 7");
        }
        else if(steelh>50 || carbon<0.7 || tensile>5600){
            System.out.println("grade 6");
        }
        else (steelh>50 || carbon<0.7 || tensile>5600) {
            System.out.println("grade 5");
        }
*/
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter");
    int salary = sc.nextInt();
double gross;
    if(salary<=10000){
        gross = 2*salary;
        System.out.println(gross);
    }
    else if(salary<=20000){
        gross = 2.15*salary;
        System.out.println(gross);

    }
    else{
    gross = 2.25*salary;
    System.out.println(gross);
}
}
}



