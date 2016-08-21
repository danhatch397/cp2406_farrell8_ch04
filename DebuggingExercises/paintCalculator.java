import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Daniel on 8/18/16.
 */
public class paintCalculator {
    public static void main(String[] args) {
        System.out.println("Enter the length of the room:");
        Scanner kb = new Scanner(System.in);
        String userLength = kb.nextLine();
        System.out.println("Enter the width of the room:");
        String userWidth = kb.nextLine();
        System.out.println("Enter the height of the room:");
        String userHeight = kb.nextLine();
        double length = Double.parseDouble(userLength);
        double width = Double.parseDouble(userWidth);
        double height = Double.parseDouble(userHeight);

        displayPrice(length, width, height);

    }
    public static void displayPrice(double length, double width, double height){
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Price will be $" + df.format((((((length * height) * 2) + ((width * height) * 2)) / 350) * 32)));
    }
}
