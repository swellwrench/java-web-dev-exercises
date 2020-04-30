package exercises.Assignment1;
import java.util.Scanner;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Rectangle width:");
        double width = input.nextDouble();
        System.out.println("Rectangle height:");
        double height = input.nextDouble();
        input.close();
        double area = height * width;
        System.out.println("Rectangle area: " + area);

    }
}
