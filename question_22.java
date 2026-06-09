
// Q -> Check if a string contains only digits?

// If first char is NOT a digit, return false immediately. If it is, 
// recurse on the rest. Only return true when the whole string passes.

import java.util.*;
import java.lang.*;

public class question_22 {

    static boolean onlyDigits(String str) {
        if (str.isEmpty()) return true;

        if (!Character.isDigit(str.charAt(0)))
            return false;

        return onlyDigits(str.substring(1));
    }

    public static void main(String[] args) {
        boolean result = onlyDigits("1234a");

        System.out.println(result);
    }
}
