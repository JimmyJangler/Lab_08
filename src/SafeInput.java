import java.util.Scanner;

public class SafeInput {

    /**
     * method to block zero length inputs
     * @param pipe a Scanner opened to read from system.in
     * @param prompt prompt for the user
     * @return a String response that is not zero length
     */

    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retString = "";

        do {
            System.out.print("\n" + prompt + ": ");
            retString = pipe.nextLine();

        }while (retString.length() == 0 );

        return retString;
    }
        /**
         * method to get and check valid integer
         * @param pipe scanner to read from system.in
         * @param prompt prompt for the user
         * @return returns valid integer
         */

        public static int getInt(Scanner pipe, String prompt) {
            int retValue = 0;
            String trash = "";
            boolean done = false;

            do {
                System.out.print("\n" + prompt + ": ");
                if (pipe.hasNextInt()) {
                    retValue = pipe.nextInt();
                    pipe.nextLine();
                    done = true;
                } else {
                    trash = pipe.nextLine();
                    System.out.println("You must enter a valid number not: " + trash);
                }

            } while (!done);

            return retValue;
        }

    /**
     * method to get and check valid double
     * @param pipe scanner to read from system.in
     * @param prompt prompt the user
     * @return valid double
     */
    public static double getDouble(Scanner pipe, String prompt)
    {
        double retValue = 0.0;
        String trash = "";
        boolean done = false;

        do {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextDouble())
            {
                retValue = pipe.nextDouble();
                pipe.nextLine();
                done = true;
            } else {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid number not: " + trash);
            }
        }while (!done);

        return retValue;
    }

        /**
         * method to check if number is in pre-defined range
         * @param pipe scanner to read from system.in
         * @param prompt prompt for user
         * @param low number range low value
         * @param high number range high value
         * @return an int that is in the range
         */
        public static int getRangedInt(Scanner pipe, String prompt, int low, int high)
        {
            int retValue = 0;
            String trash = "";
            boolean done = false;

            do {
                System.out.print("\n" + prompt + "[" + low + "-" + high + "]: ");
                if (pipe.hasNextInt()) {
                    retValue = pipe.nextInt();
                    pipe.nextLine();
                    if (retValue >= low && retValue <= high) {
                        done = true;
                    } else {
                        System.out.println("\nNumber is out of range [" + low + "-" + high + "] not: " + retValue);
                    }
                } else {
                    trash = pipe.nextLine();
                    System.out.println("You must enter a valid number not: " + trash);
                }
            }while (!done);

            return retValue;
        }

    /**
     *
     * @param pipe scanner for system.in
     * @param prompt prompt the user
     * @param low low value for number range
     * @param high high value for number range
     * @return return valid double in number range
     */

        public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {
            double retValue = 0;
            String trash = "";
            boolean done = false;

            do {
                System.out.print("\n" + prompt + "[" + low + "-" + high + "]");
                if (pipe.hasNextDouble()) {
                    retValue = pipe.nextDouble();
                    pipe.nextLine();
                    if (retValue >= low && retValue <= high) {
                        done = true;
                    } else {
                        System.out.println("\nNumber is out of range [" + low + "-" + high + "] not: " + retValue);
                    }

                } else {
                    trash = pipe.nextLine();
                    System.out.println("You must enter a valid number not: " + trash);
                }

            } while (!done);

            return retValue;

        }

    /**
     * Method to get Y or N confirmation
     * @param pipe scanner for system.in
     * @param prompt prompt for user input
     * @return return true or false according to Y or N
     */

    public static boolean getYNConfirm(Scanner pipe, String prompt)
        {
            String trash = "";
            String inputYN = "";
            boolean done = false;
            boolean retValue = true;

            do {
                System.out.print("\n" + prompt + "[Y/N]: ");
                if (pipe.hasNextLine())
                {
                    inputYN = pipe.nextLine();
                    if (inputYN.equalsIgnoreCase("Y"))
                    {
                        pipe.nextLine();
                        retValue = true;
                        done = true;
                    } else if (inputYN.equalsIgnoreCase("N")) {
                        pipe.nextLine();
                        retValue = false;
                        done = true;
                    } else {
                        trash = pipe.nextLine();
                        System.out.println("You must enter a valid input! [Y/N] Not: " + trash);
                    }
                }

            }while (!done);
            return retValue;
        }

        /**

        public static String getRegExString(Scanner pipe, String prompt, String regEx)
        {

        }

         */

    }

