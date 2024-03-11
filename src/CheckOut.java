import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double itemPrice = 0.0;
        double totalPrice = 0.0;
        int items = 0;
        String trash = "";
        boolean YNContinue = true;

        do {
            itemPrice = SafeInput.getRangedDouble(in, "Enter the price of your item ", .50, 10.00);
            totalPrice = itemPrice + totalPrice;
            items ++;
            YNContinue = SafeInput.getYNConfirm(in, "Do you have more items? ");
        }while (YNContinue);
        System.out.println("You have " + items + " item(s) totalling: $" + totalPrice);

    }
}
