package Drafts;

import java.util.Scanner;

public class ConditionalOperator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter an integer: ");
        int integer = scanner.nextInt();

        String evenOrOdd = ((integer % 2 == 0) ? "Even" : "Odd");
        System.out.print(evenOrOdd);
    }
}
