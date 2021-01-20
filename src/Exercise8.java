import java.util.Scanner;
public class Exercise8 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        double Students;
        double Teachers;
        double Capacity;
        System.out.print("Students : ");
        Students = userInput.nextDouble();
        System.out.print("Teachers : ");
        Teachers = userInput.nextDouble();
        System.out.print("Capacity : ");
        Capacity = userInput.nextDouble();
        userInput.close();
        int Total = (int) ((Students + Teachers + Capacity) - 1);
        double Buses = Total / Capacity;
        int BusesNeeded = (int) Buses;
        double Overflow = (Students + Teachers) % Capacity;
        int OverflowTotal = (int) Overflow;
        System.out.print("\nBuses required    : ");
        System.out.println(BusesNeeded);
        System.out.print("Overflow passengers : ");
        System.out.println(OverflowTotal);
    }
}
