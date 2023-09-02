package Drafts;

import java.util.Random;
import java.util.Scanner;

public class test6 {
    public static void main (String[]args){

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int x;
        int y;

        System.out.println("What is your number from 1-10? ");
        x = Integer.parseInt(scanner.nextLine());
        System.out.printf("Your number is %d%n",x);


        y = random.nextInt(10)+1;
        System.out.println("The computer's number is "+y);

        scanner.close();

        if (x>y){
            System.out.print("You win!");
        }
        else {
            System.out.print("It's a tie!");
        }
    }
}
