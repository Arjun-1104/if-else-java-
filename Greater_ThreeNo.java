public class Greater_ThreeNo{
    public static void main(String[] args){
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
    }
}