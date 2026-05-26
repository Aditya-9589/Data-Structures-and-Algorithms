
// Q -> Print all characters of a string

import java.util.*;
import java.lang.*;

public class question_16 {

    static void printChar(String str, int index) {
        if (index == str.length()) return;

        System.out.print(str.charAt(index) + " ");
        printChar(str, index + 1);
    }

    public static void main(String[] args) {
        // printChar("", 0);
        printChar("Hello", 0);
    }
}
