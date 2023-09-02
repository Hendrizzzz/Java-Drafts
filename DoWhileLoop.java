package Drafts;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        int number;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter a number between 1-10 ");
            number = scanner.nextInt();
        } while (number < 1 || number > 10);
        System.out.print(number + " is a number between 1-10 ");
    }
}
