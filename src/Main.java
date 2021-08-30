import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double pi = 3.14;

        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter Radius: ");
        double r = sc.nextDouble();

        System.out.println("Please Enter the Measure of the Center Angle: ");
        double angle = sc.nextDouble();
        sc.close();

        double area = (pi * (r * r) * angle) / 360;


        System.out.println("Area: " + area);
    }
}
