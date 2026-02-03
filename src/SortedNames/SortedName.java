package SortedNames;
import java.util.Scanner;

public class SortedName
{
    /*
    The purpose of this method is to run a program that takes user input.
    This then runs through the NameSorter class to be properly sorted.
     */
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in); // The variable 'input' prints the user input on the next line.

        System.out.print("Enter name #1: ");
        String name1 = input.nextLine(); // 'name1' is the user input required to sort.

        System.out.print("Enter name #2: ");
        String name2 = input.nextLine(); // 'name2' is the user input required to sort.

        System.out.print("Enter name #3: ");
        String name3 = input.nextLine(); // 'name3' is the user input required to sort.

        NameSorter.sortAndPrint(name1, name2, name3);

        input.close();

    }
}
