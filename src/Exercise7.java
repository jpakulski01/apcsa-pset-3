import java.util.Scanner;
public class Exercise7 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        double Salary;
        double Retire;
        double Federal;
        double State;
        System.out.print("Salary  : ");
        Salary = userInput.nextDouble();
        System.out.print("401(k)  : ");
        Retire = userInput.nextDouble();
        System.out.print("Federal : ");
        Federal = userInput.nextDouble();
        System.out.print("State   : ");
        State = userInput.nextDouble();
        userInput.close();
        double percent401k = (100 - Retire) / 100;
        double newSalary = Salary * percent401k;
        double Paycheck = newSalary / 24;
        double percentFederal = Federal / 100;
        double percentState = State / 100;
        double taxFederal = Paycheck * percentFederal;
        double taxState = Paycheck * percentState;
        double ActualPaycheck = Paycheck - taxFederal - taxState;
        System.out.print("\n$");
        System.out.printf("%,.2f",ActualPaycheck);
        System.out.println(".");
    }
}
