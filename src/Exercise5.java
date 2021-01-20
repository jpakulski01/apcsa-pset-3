import java.util.Scanner;
public class Exercise5 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        double HW1;
        double HW2;
        double HW3;
        double Quiz1;
        double Quiz2;
        double Test1;
        System.out.print("Homework 1 : ");
        HW1 = userInput.nextDouble();
        System.out.print("Homework 2 : ");
        HW2 = userInput.nextDouble();
        System.out.print("Homework 3 : ");
        HW3 = userInput.nextDouble();
        System.out.print("Quiz 1     : ");
        Quiz1 = userInput.nextDouble();
        System.out.print("Quiz 2     : ");
        Quiz2 = userInput.nextDouble();
        System.out.print("Test 1     : ");
        Test1 = userInput.nextDouble();
        userInput.close();
        double avgHomework = (HW1 + HW2 + HW3) / 3;
        double avgQuiz = (Quiz1 + Quiz2) / 2;
        double avgGrade = (avgHomework*0.15) + (avgQuiz*0.35) + (Test1*0.5);
        System.out.printf("\n%,.2f",avgGrade);
        System.out.print("%.");
    }
}
