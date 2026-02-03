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
        System.out.print("Did that fix the problem? (true/false): ");
        boolean isFixed1 = input.nextBoolean(); // The "isFixed1" variable takes the first boolean.

        if(isFixed1)
        {
            return;
        }
        else
        {
            System.out.println("\nReboot the router and try to connect.");
            System.out.print("Did that fix the problem? (true/false): ");
            boolean isFixed2 = input.nextBoolean(); // The "isFixed2" variable takes the second boolean.

            if(isFixed2)
            {
                return;
            }
            else
            {
                System.out.println("\nMake sure the cables between the router & modem are plugged in firmly.");
                System.out.print("Did that fix the problem? (true/false): ");
                boolean isFixed3 = input.nextBoolean(); // The "isFixed3" variable takes the third boolean.

                if(isFixed3)
                {
                    return;
                }
                else
                {
                    System.out.println("\nMove the router to a new location.");
                    System.out.print("Did that fix the problem? (true/false): ");
                    boolean isFixed4 = input.nextBoolean(); // The "isFixed4" variable takes the fourth boolean.

                    if(isFixed4)
                    {
                        return;
                    }
                    else
                    {
                        System.out.println("\nGet a new router.");
                    }
                }
            }
        }

    }
}
