package Drafts;

public class Conversion {
    public static void main(String[] args) {

        //String to Integer
        String name = "30";
        int intName = Integer.parseInt(name);
        System.out.println(intName);

        //Integer to String
        int number = 24;
        String stringNumber = String.valueOf(number);
        String stringNumber1 = Integer.toString(number);
        System.out.println(stringNumber);
        System.out.println(stringNumber1);

        //Floating-point to String
        double pi = 3.25;
        float pies = 3.113f;
        String stringPi = String.valueOf(pi);
        String stringPi1 = Double.toString(pi);
        String stringPies = String.valueOf(pies);
        String stringPies1 = Double.toString(pies);
        System.out.println(stringPi);
        System.out.println(stringPi1);
        System.out.println(stringPies);
        System.out.println(stringPies1);

        //String to floating-point
        String age = "24.221";
        float fAge = Float.parseFloat(age);
        double dAge = Double.parseDouble(age);
        System.out.println(fAge);
        System.out.println(dAge);

        //Character to String
        char letter = 'j';
        String sLetter = String.valueOf(letter);
        System.out.println(sLetter);

        //String to Character
        String hello = "h";
        char characterHello = hello.charAt(0);
        System.out.println(characterHello);
    }
}
