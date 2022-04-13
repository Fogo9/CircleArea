import java.util.Scanner;

public class Circlearea{
    
    public static void main(String[] args) {

        int r, a;

        double pi = 3.14;

        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter The Radius of The Circle : ");

        r = input.nextInt();

        System.out.print("Enter The Central Angle : ");

        a = input.nextInt();
        

        double area = pi * r * r;

        double circumference = 2 * pi * r;

        double centralArea = (pi * (r*r) * a) / 360;


        System.out.println("Area of The Circle :" + area);

        System.out.println("Circumference of The Circle :" + circumference);

        System.out.println("Area of The Circle Segment :" + centralArea);

    }
}
