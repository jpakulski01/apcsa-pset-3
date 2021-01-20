import java.util.Scanner;
public class Exercise9 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        double Balance;
        double Quarters;
        double Dimes;
        double Nickels;
        double Pennies;
        System.out.print("Amount : ");
        Balance = userInput.nextDouble();
        userInput.close();
        double NoQuarters;
        NoQuarters = Balance % 0.25;
        double tempBalance;
        tempBalance = Balance - NoQuarters;
        Quarters = tempBalance / 0.25;
        Balance = Balance -  tempBalance;
        double NoDimes;
        NoDimes = Balance % 0.1;
        tempBalance = Balance - NoDimes;
        Dimes = tempBalance / 0.1;
        Balance = Balance - tempBalance;
        double NoNickels;
        NoNickels = Balance % 0.05;
        tempBalance = Balance - NoNickels;
        Nickels = tempBalance / 0.05;
        Balance = Balance - tempBalance;
        Pennies = Balance / 0.01;
        System.out.print("\nQuarters : ");
        System.out.println((int)Quarters);
        System.out.print("Dimes    : ");
        System.out.println((int)Dimes);
        System.out.print("Nickels  : ");
        System.out.println((int)Nickels);
        System.out.print("Pennies  : ");
        System.out.println((int)Pennies);
    }
}
