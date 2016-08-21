import java.util.Scanner;

/**
 * Created by Daniel on 8/20/16.
 */
public class Insurance {
    public static void main(String[] args) {
        System.out.println("Please enter the current year:");
        Scanner kb = new Scanner(System.in);
        int year = kb.nextInt();
        System.out.println("Please enter your birth year (YYYY):");
        int birthYear = kb.nextInt();

        getPrice(year, birthYear);
    }

    public static void getPrice(int year, int birthYear) {
        int age = (year - birthYear);
        int decade = Integer.parseInt(Integer.toString(age).substring(0,1));
        //System.out.println(decade);
        double cost = (decade + 15) * 20;
        System.out.println("Your insurance will cost: $" + cost);
    }
}
