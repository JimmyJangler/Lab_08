import java.util.Scanner;

public class Reggie {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String SSN = "";
        String MNumber = "";
        String menuChoice = "";
        SSN = SafeInput.getRegExString(in, "Enter your SSN", "^\\d{3}-\\d{2}-\\d{4}$");
        MNumber = SafeInput.getRegExString(in, "Enter your UC Student M number", "^(M|m)\\d{5}$");
        menuChoice = SafeInput.getRegExString(in, "Choose from the menu!\n[O- open, S - save, V - view, Q - quit]", "^[OoSsVvQq]$");


        System.out.println("This is your SSN: " + SSN);
        System.out.println("This is your UC Student M number: " + MNumber);
        System.out.println("Your menu choice: " + menuChoice);

    }
}
