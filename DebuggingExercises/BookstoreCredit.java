import java.util.Scanner;

/**
 * Created by Daniel on 8/18/16.
 */
public class BookstoreCredit {
    public static void main(String[] args) {
        System.out.println("Enter student name:");
        Scanner kb = new Scanner(System.in);
        String userEnter = kb.nextLine();
        System.out.println("Enter student's GPA:");
        String userGrade = kb.nextLine();
        double gpa = Double.parseDouble(userGrade);

        displayCredit(userEnter, gpa);

    }

    public static void displayCredit(String name, double gpa){
        System.out.println("Congratulations " + name + "! For your GPA of " + gpa + ", you have recieved $" +
                (gpa * 10) + " to spend at the bookstore! Keep up the good work!");
    }
}
