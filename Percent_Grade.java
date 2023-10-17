public class Percent_Grade{
    public static void main(String[] args){
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
    }
}