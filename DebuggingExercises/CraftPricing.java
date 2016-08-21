import java.util.Scanner;

/**
 * Created by Daniel on 8/21/16.
 */
public class CraftPricing {
    public static void main(String[] args) {
        System.out.println("Welcome! Would you like to purchase anything? (yes or no)");
        int purse = 0, tshirt = 0, hat = 0;
        String userDay;
        Scanner kb = new Scanner(System.in);
        String choice = kb.nextLine();

        while (choice.equals("yes")) {

            System.out.println("What item would you like?");
            System.out.println("Purse");
            System.out.println("T-shirt");
            System.out.println("Hat and gloves");
            System.out.println("or exit");
            String userEnter = kb.nextLine();

            if (userEnter.equals("purse")){
                System.out.println("How many would you like?");
                String userPurse = kb.nextLine();
                int p = Integer.parseInt(userPurse);
                purse = purse + p;
                do {
                    System.out.println("Would you like to purchase anything else today?");
                    userDay = kb.nextLine();
                    if (userDay.equals("yes")) {
                        break;
                    } else if (userDay.equals("no")) {
                        System.out.println("Proceeding to checkout...");
                        System.out.println();
                        break;
                    } else {
                        System.out.println("Sorry, we couldn't understand that.");
                    }
                } while (!userDay.equals("yes") || !userDay.equals("no"));
                break;

            } else if (userEnter.equals("t-shirt")){
                System.out.println("How many would you like?");
                String userShirt = kb.nextLine();
                int s = Integer.parseInt(userShirt);
                tshirt = tshirt + s;
                do {
                    System.out.println("Would you like to purchase anything else today?");
                    userDay = kb.nextLine();
                    if (userDay.equals("yes")) {
                        break;
                    } else if (userDay.equals("no")) {
                        System.out.println("Proceeding to checkout...");
                        System.out.println();
                        break;
                    } else {
                        System.out.println("Sorry, we couldn't understand that.");
                    }
                } while (!userDay.equals("yes") || !userDay.equals("no"));
                break;

            } else if (userEnter.equals("hat and gloves")){
                System.out.println("How many would you like?");
                String userHat = kb.nextLine();
                int h = Integer.parseInt(userHat);
                hat = hat + h;
                do {
                    System.out.println("Would you like to purchase anything else today?");
                    userDay = kb.nextLine();
                    if (userDay.equals("yes")) {
                        break;
                    } else if (userDay.equals("no")) {
                        System.out.println("Proceeding to checkout...");
                        System.out.println();
                        break;
                    } else {
                        System.out.println("Sorry, we couldn't understand that.");
                    }
                } while (!userDay.equals("yes") || !userDay.equals("no"));
                break;

            } else if (userEnter.equals("exit")){
                break;
            } else {
                System.out.println("Sorry, we couldn't understand that.");
            }

        }
        if (purse != 0 || tshirt != 0 || hat != 0) {
            System.out.println("Checkout Details:");
            System.out.println();
            checkoutDetails(purse, tshirt, hat);
        }
        System.out.println("Goodbye! Come again!");
        //INSERT CHECKOUT DETAILS HERE
    }
    public static void checkoutDetails(int purse, int shirt, int hat){
        System.out.println("You purchased:");
        System.out.println(purse + " purse(s) at $30 each");
        System.out.println(shirt + " t-shirt(s) at $10 each");
        System.out.println(hat + " hat and gloves at $20 each");
        System.out.println("For a sub-total of $" + ((purse * 30) + (shirt * 10) + (hat * 20)));
        System.out.println("With $7 shipping and handling your total is $" + (((purse * 30) + (shirt * 10) + (hat * 20)) + 7));
    }
}
