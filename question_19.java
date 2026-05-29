
// Q -> Remove all occurrences of a character 

// Exact same as replace, but instead of swapping, just skip the matched character.


import java.util.*;
import java.lang.*;

public class question_19 {

    static String removeChar(String str, char target) {
        if (str.isEmpty()) return "";  // BASE CASE

        char first = str.charAt(0);

        if (first == target) {
            return removeChar(str.substring(1), target);
        }

        return first + removeChar(str.substring(1), target);
    }

    public static void main(String[] args) {
        // removeChar("banana", 'a');
        System.out.println(removeChar("banana", 'a'));

        // System.out.println(removeChar);
    }
}
