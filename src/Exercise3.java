import java.util.Scanner;
public class Exercise3 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        double height;
        double width;
        System.out.print("Height : ");
        height = userInput.nextDouble();
        System.out.print("Width : ");
        width = userInput.nextDouble();
        userInput.close();
        height *= 25.4;
        width *= 25.4;
        double area = height * width;
        System.out.printf("\n%,.2f",area);
        System.out.print(" square millimeters.");

    }
}
