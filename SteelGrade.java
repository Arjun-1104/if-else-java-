public class SteelGrade{
    public static void main(String[] args){
    int steelh=1,tensile=500;
    double carbon = 8.5;
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
        else {
            System.out.println("grade 5");
        }
    }
}