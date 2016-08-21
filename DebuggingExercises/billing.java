import java.util.Scanner;

/**
 * Created by Daniel on 8/18/16.
 */
public class billing {
    public static void main(String[] args) {
        double price = 25;
        int number = 5;
        double coupon = 0.8;

        computeBill(price);
        computeBill(price, number);
        computeBill(price, number, coupon);
    }
    public static void computeBill(double price){
        System.out.println("Total price: $" + (price * 1.08));
    }
    public static void computeBill(double price, int number){
        System.out.println("Total price: $" + ((price * number) * 1.08));
    }
    public static void computeBill(double price, int number, double coupon){
        System.out.println("Total price: $" + (((price * number) * coupon) * 1.08));
    }
}
//System.out.println("Please enter price:");
//        Scanner kb = new Scanner(System.in);
//        String userPrice = kb.nextLine();
//        double price = Double.parseDouble(userPrice);
//        System.out.println("Enter quantity:");
//        String userQuant = kb.nextLine();
//        int number = Integer.parseInt(userQuant);
//        System.out.println("Enter coupon value:");
//        String userCoup = kb.nextLine();
//        double coupon = Double.parseDouble(userCoup);
//
//        if (userPrice != null && userQuant == null && userCoup ==null){
//            computeBill(price);
//        } else if(userQuant != null && userCoup == null){
//            computeBill(price, number);
//        } else if(userCoup != null){
//            computeBill(price, number, coupon);
//        }
//
//
//    }