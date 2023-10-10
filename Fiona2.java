// gawa daw ng gan2



import java.util.Scanner;

public class Fiona2 {

    public static final String STUDENTNAME = "Fiona";

    public static void main(String[] args) {

        // Declaring variables
        double quiz;
        double quizPScore;
        double exam;
        double examPScore;
        double prelimGrade;
        String rating;
        String[] gradeArray = {"A", "B", "C", "D"};


        //Creating A scanner Object
        Scanner kbd = new Scanner(System.in);


        
        System.out.print("Quiz Score: "); //Quiz Score
        quiz = kbd.nextInt();
        System.out.print("Perfect Quiz Score: "); //Perfect Quiz Score
        quizPScore = kbd.nextInt();
        System.out.print("\nExam Score: "); //Exam Score
        exam = kbd.nextInt();
        System.out.print("Perfect Exam Score: "); //Perfect Exam Score
        examPScore = kbd.nextInt();



        //Prelimgrade Computation
        prelimGrade = ((((((quiz/quizPScore)*50)+50) + (((exam/examPScore)*50)+50)))/2);



        //Displaying Grade of FIONA
        if ((prelimGrade >= 90) && (prelimGrade <= 100)) {
            rating = gradeArray[0];
        } else if ((prelimGrade >= 80) && (prelimGrade < 90)) {
            rating = (gradeArray[1]);
        } else if ((prelimGrade >= 75) && (prelimGrade < 80)) {
            rating = (gradeArray[2]);
        } else{
            rating = (gradeArray[3]);
        }
        System.out.println("\n\nStudent: " + STUDENTNAME);
        System.out.println("Rating: " + rating);
        System.out.printf("Numeric Grade: %.2f%n",prelimGrade);
        System.out.print("Height: 4'9" + "\"");
    }
}
