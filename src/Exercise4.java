import java.util.Scanner;
public class Exercise4 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        double height;
        double width;
        System.out.print("Height : ");
        height = userInput.nextDouble();
        System.out.print("Width : ");
        width = userInput.nextDouble();
        userInput.close();
        height *= 2.54;
        width *= 2.54;
        double perimeter = 2*height + 2*width;
        System.out.printf("\n%,.2f",perimeter);
        System.out.print(" centimeters.");
    }
}
