import java.util.Scanner;

public class DevTest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        /** GetUserName.java DevTesting

        Scanner in = new Scanner(System.in);

        String firstName = "";
        String lastName = "";
        firstName = SafeInput.getNonZeroLenString(in, "Enter your first name");
        lastName = SafeInput.getNonZeroLenString(in, "Enter your last name");
        System.out.println("\nYour full name is: " + firstName + " " + lastName);
         */

        /** FavNumbers.java dev testing

        int favInt = 0;
        double favDouble = 0;
        favInt = SafeInput.getInt(in, "Enter your favorite integer");
        favDouble = SafeInput.getDouble(in, "Enter your favorite double");
        System.out.println("\nYour favorite integer is: " + favInt + "\nYour favorite double is: " + favDouble);

         */


        /** BirthDateTime.java dev testing

        int birthYear = 0;
        int birthMonth = 0;
        int birthDay = 0;
        int birthHour = 0;
        int birthMinute = 0;

        birthYear = SafeInput.getRangedInt(in, "Enter your birth year ", 1950, 2015);
        birthMonth = SafeInput.getRangedInt(in, "Enter your birth  month ", 1, 12);
        switch (birthMonth){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                birthDay = SafeInput.getRangedInt(in, "Enter your birth day ", 1, 31);
                break;
            case 4: case 6: case 9: case 11:
                birthDay = SafeInput.getRangedInt(in, "Enter your birth day ", 1, 30);
                break;
            case 2:
                birthDay = SafeInput.getRangedInt(in, "Enter your birth day ", 1, 29);

        }
        birthHour = SafeInput.getRangedInt(in, "Enter your birth hour ", 1, 24);
        birthMinute = SafeInput.getRangedInt(in, "Enter your birth minute ", 1, 60);
        System.out.println("\nYour Date and time of birth is: " + birthDay + "/" + birthMonth + "/" + birthYear + " at " + birthHour + ":" + birthMinute);
         */





        /** checkout.java dev testing */


        /** reggie.java dev testing */


        /** PrettyHeader.java dev testing */




        /** CtoFTableDisplay.java dev testing */

    }
}