package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        double radius;
        double area;
        Scanner input;
        Boolean completionToken;

        completionToken = false;
        while (completionToken.equals(false)) {
            input = new Scanner(System.in);
            System.out.println("Enter a radius:");
            radius = input.nextDouble();
            if (radius > 0) {
                input.close();
                area = Math.PI * radius * radius;
                completionToken = true;
                System.out.println("The area of a circle of radius " + radius + " is: " + area);
            } else {
                System.out.println("You cannot use a negative radius! Try again.");
            }
        }
    }
}
