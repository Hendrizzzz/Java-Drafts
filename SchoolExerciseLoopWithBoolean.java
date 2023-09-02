package Drafts;

import java.util.Scanner;

public class SchoolExerciseLoopWithBoolean {
    public static void main(String[] args) {

        //declaring variables
        double side;
        double area;
        double perimeter;
        boolean isTrue = true;

        //scanner method
        Scanner scanner = new Scanner (System.in);

        while (isTrue) {

            //loop until the user inputs the right character
            while (true) {

                //ask the number
                System.out.println("Enter the side of the Square: ");
                if (scanner.hasNextDouble()) {
                    side = scanner.nextDouble();
                    scanner.nextLine();
                    break;
                }
            scanner.nextLine();
            }

            //computation for the perimeter and area
            perimeter = side * 4;
            area = side * side;

            //printing of results
            System.out.println("The perimeter of the square is " + perimeter + " ");
            System.out.println("The area of the square is " + area + " ");

            //asking the user for another
            System.out.println("Type \"no\" to exit ");
            System.out.println("Do you want to continue? ");
            String answer = scanner.nextLine().trim().toLowerCase();

            if (answer.equals("no")){
                isTrue = false;
            }
        }
    }
}
