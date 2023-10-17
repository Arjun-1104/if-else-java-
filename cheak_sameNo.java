public class cheak_sameNo{
    public static void main(String[] args){
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
        else{
                System.out.println("scaler");
        }
    }
}