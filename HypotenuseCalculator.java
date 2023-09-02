package Drafts;

import java.util.Scanner;

public class HypotenuseCalculator {
    public static void main (String[]args){

        double a;
        double b;
        double c;

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the shorter side? ");
        a = Double.parseDouble(scanner.nextLine());


        System.out.println("What is the longer side? ");
        b = Double.parseDouble(scanner.nextLine());

        c = Math.sqrt((a*a)+(b*b));



        System.out.print(c);


    }
}
