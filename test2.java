package Drafts;

import java.util.Scanner;

public class test2 {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);

        //Input of user's name and greet
        System.out.println("What is your name? ");
        String username = scanner.nextLine();
        System.out.println("Hello " + username);
        scanner.next();

        //Asking the user their age
        System.out.printf("How old are you %s? ", username);
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.printf("%s, you are %d years old%n", username, age);

        //floating value
        System.out.printf("So %s, if you are really %d years old, then give me a floating value: ", username, age);
        double value = scanner.nextDouble();
        scanner.nextLine();
        System.out.printf("You're right %s, %.9f is a floating value%n", username, value);

        //boolean
        System.out.printf("Given that you are %d years old, are you still in college? (True/False) ", age);
        boolean isCollege = scanner.nextBoolean();
        scanner.nextLine();
        System.out.printf("Your answer is %b%nIt is nice to hear%n", isCollege);

        //character
        System.out.printf("I would like top know your favorite letter %s ", username);
        char letter = scanner.next().charAt(0);
        System.out.printf("Wow, you're favorite letter is %c%n", letter);

        //close the scanner
        scanner.close();

        //ending
        System.out.print("Thank you!");
    }
}
