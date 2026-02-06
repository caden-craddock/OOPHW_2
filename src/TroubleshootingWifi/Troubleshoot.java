package TroubleshootingWifi;
import java.util.Scanner;

public class Troubleshoot
{
    /*
    The purpose of this method is to set up a user input.
    The program then runs through a stream of if/else statements to be completed properly.
     */
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in); // The "input" variable sets up the user input function.
        System.out.println("Reboot the computer and try to connect.");
        System.out.print("Did that fix the problem? (yes/no): ");
        String value1 = input.nextLine(); // The "value1" variable takes the first boolean.

        boolean isYes = value1.trim().equalsIgnoreCase("yes"); // Converts "yes" into a boolean.


        if(isYes)
        {
            System.out.println("[TROUBLESHOOT SUCCESSFUL]");
        }
        else
        {
            System.out.println("\nReboot the router and try to connect.");
            System.out.print("Did that fix the problem? (yes/no): ");
            String value2 = input.nextLine();
            boolean isYes2 = value2.trim().equalsIgnoreCase("yes");

            if(isYes2)
            {
                System.out.println("[TROUBLESHOOT SUCCESSFUL]");
            }
            else
            {
                System.out.println("\nMake sure the cables between the router & modem are plugged in firmly.");
                System.out.print("Did that fix the problem? (yes/no): ");
                String value3 = input.nextLine();
                boolean isYes3 = value2.trim().equalsIgnoreCase("yes");

                if(isYes3)
                {
                    System.out.println("[TROUBLESHOOT SUCCESSFUL]");
                }
                else
                {
                    System.out.println("\nMove the router to a new location.");
                    System.out.print("Did that fix the problem? (yes/no): ");
                    String value4 = input.nextLine();
                    boolean isYes4 = value2.trim().equalsIgnoreCase("yes");

                    if(isYes4)
                    {
                        System.out.println("[TROUBLESHOOT SUCCESSFUL]");
                    }
                    else
                    {
                        System.out.println("\nGet a new router!");
                    }
                }
            }
        }
    }
}
