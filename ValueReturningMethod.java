package Drafts;

import java.util.Scanner;

public class ValueReturningMethod {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Sum of the Squares Calculator! ");
        int answer = squareX() + squareY();
        System.out.println("The sum of the squares is " + answer);
    }
    static int squareX(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the first number? ");
        int squareX = scanner.nextInt();
        return squareX*squareX;
    }
    static int squareY(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the second number? ");
        int squareY = scanner.nextInt();
        return squareY*squareY;
    }
}
