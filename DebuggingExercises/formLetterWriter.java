/**
 * Created by Daniel on 8/18/16.
 */
public class formLetterWriter {
    public static void main(String[] args) {
        String first = "John";
        String last = "Smith";

        displaySalutation(last);
        displaySalutation(first, last);
    }
    public static void displaySalutation(String last){
        System.out.println("Dear Mr. or Mrs. " + last +", ");
        System.out.println("Thank you for your recent order!");
    }
    public static void displaySalutation(String first, String last) {
        System.out.println("Dear " + first + " " + last + ",");
        System.out.println("Thank you for your recent order!");
    }
}
