package RomanNumerals;
import java.util.Scanner;

public class RomanNumeralConverter
{
    /*
    The purpose of this method is to convert a user input into
    a roman numeral. The program only accepts integers as well.
     */
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in); // The 'input' variable calls the scanner.

        System.out.print("Choose a number between 1 and 90: ");
        int num = input.nextInt(); // The 'num' variable takes the user input for the integer.

        if (num < 1 || num > 90) // This simply declines the user from choosing anything outside of the range 1--90
        {
            System.out.println("Number must be between 1 and 90.");
            return;
        }

        StringBuilder roman = new StringBuilder(); // Steadily builds the string based on the given input. For example
                                                   // 59 = 50 + 9 which is LIX or even 15 = 10 + 5 which is XV

        while (num >= 90) { roman.append("XC"); num -= 90; }
        while (num >= 50) { roman.append("L");  num -= 50; }
        while (num >= 40) { roman.append("XL"); num -= 40; }
        while (num >= 10) { roman.append("X");  num -= 10; }
        while (num >= 9)  { roman.append("IX"); num -= 9;  }
        while (num >= 5)  { roman.append("V");  num -= 5;  }
        while (num >= 4)  { roman.append("IV"); num -= 4;  }
        while (num >= 1)  { roman.append("I");  num -= 1;  }

        System.out.println("Roman numeral: " + roman);
        input.close();
    }
}
