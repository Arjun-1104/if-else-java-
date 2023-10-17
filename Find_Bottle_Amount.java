public class Find_Bottle_Amount{
    public static void main(String[] args){
        int bprize = 20,bquantity = 100,total;
        int ans = bprize * bquantity;
        
        if (bquantity > 100) {
            int dis = (ans * 10) / 100;
            total = ans - dis;
            System.out.println("Bottle amount is: " + total);
        } else {
            System.out.println("Bottle amount is: " + ans);
        }
    }
}