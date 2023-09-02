package Drafts;

import java.util.Scanner;

public class test4 {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the a?");
        double a = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("What is b?");
        double b = scanner.nextDouble();
        scanner.nextLine();

        double aSquared = Math.pow(a, 2);
        double bSquared = Math.pow(b, 2);

        double cSquared = (aSquared + bSquared);
        double c = Math.sqrt(cSquared);

        System.out.printf("The hypotenuse is %.2f", c);
    }
}
