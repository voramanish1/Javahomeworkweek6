package javaprogrames1;
import java.util.Scanner;// when you need data from user - use scanner

public class Question6 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        double r = s.nextDouble();
        System.out.println("enter the radius");
        double area = (22 * r * r) / 7;
        System.out.println("Area of Circle is:" + area);

    }

}
