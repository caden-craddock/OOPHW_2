package SortedNames;
import java.util.Arrays;
/*
The purpose of this class is to use user inputs from "SortedName" to run a sorting method algorithm.
It prints those names out in an array.
 */
public class NameSorter {
    /**
     * Sorts names alphabetically.
     * @param n1 first name
     * @param n2 second name
     * @param n3 third name
     */
    public static void sortAndPrint(String n1, String n2, String n3) {
        // Create an array with the names
        String[] names = {n1, n2, n3};

        // Use Arrays.sort to sort the names alphabetically
        Arrays.sort(names, String::compareToIgnoreCase);

        // Print the sorted names
        System.out.println("\nNames in alphabetical order:");
        for (String name : names) {   // array is "names", assigned to "name"
            System.out.println(name); // This line then prints every input (name) from the "names" array.
        }
    }
}

