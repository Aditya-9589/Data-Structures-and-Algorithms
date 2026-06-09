

// Q -> Convert string to uppercase using recursion

// -->> Convert the first character to uppercase, concatenate it with the 
// uppercase-version of the rest.

import java.lang.*;
import java.util.*;


public class question_21 {

    static String upperCase(String str) {
        if (str.isEmpty()) return "";

        char up = Character.toUpperCase(str.charAt(0));

        return up + upperCase(str.substring(1));
    }

    public static void main(String[] args) {
        
        String result = upperCase("hello world");

        System.out.println(result);
    }
}
