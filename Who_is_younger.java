public class Who_is_younger{
    public static void main(String[] args){
    //r=ram,s=shayam,a=ajay
    
    int r = 16, s = 8,a = 17;
    
        if(r<s && r<a){
            System.out.println("ram chota hai");
        }
        else if(s<r && s<a){
            System.out.println("shayam chota hai");
        }
        else {
            System.out.println("ajay chota hai");
        }
    }
}