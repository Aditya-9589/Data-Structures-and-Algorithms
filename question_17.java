
import java.lang.*;
import java.util.*;

public class question_17 {

    static boolean isPalindrome(String str) {
        if (str.length() <= 1) return true;

        char first = str.charAt(0);
        char last = str.charAt(str.length() - 1);

        if ( first != last) return false;

        return isPalindrome(str.substring(1, str.length() - 1));
    }

    public static void main(String[] args) {
        // isPalindrome("Nitin");
        System.out.println(isPalindrome("niTIn"));
    }
}
