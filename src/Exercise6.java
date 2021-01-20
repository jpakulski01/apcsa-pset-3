import java.util.Scanner;
public class Exercise6 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        double Wage;
        double Mon;
        double Tue;
        double Wed;
        double Thu;
        double Fri;
        double Sat;
        double Sun;
        System.out.print("Wage      : ");
        Wage = userInput.nextDouble();
        System.out.print("Monday    : ");
        Mon = userInput.nextDouble();
        System.out.print("Tuesday   : ");
        Tue = userInput.nextDouble();
        System.out.print("Wednesday : ");
        Wed = userInput.nextDouble();
        System.out.print("Thursday  : ");
        Thu = userInput.nextDouble();
        System.out.print("Friday    : ");
        Fri = userInput.nextDouble();
        System.out.print("Saturday  : ");
        Sat = userInput.nextDouble();
        System.out.print("Sunday    : ");
        Sun = userInput.nextDouble();
        userInput.close();
        double Hours = Mon + Tue + Wed + Thu + Fri + Sat + Sun;
        double Pay = Wage * Hours;
        System.out.print("\n$");
        System.out.printf("%,.2f",Pay);
        System.out.print(".");
    }
}
