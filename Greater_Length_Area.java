public class Greater_Length_Area {
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
    }
}