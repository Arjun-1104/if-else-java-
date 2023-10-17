public class Find_dayOf_Month{
    public static void main(String[] args){
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
    }
}