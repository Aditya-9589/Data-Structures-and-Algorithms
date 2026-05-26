
// Q -> Count vowels in a string

import java.util.*;
import java.lang.*;


public class question_18 {

    static int countVowels(String str) {
        if (str.isEmpty()) return 0;

        char ch = Character.toLowerCase(str.charAt(0));
        boolean isVowel = "aeiou".indexOf(ch) != -1;

        return (isVowel ? 1 : 0) + countVowels(str.substring(1));
    }

    public static void main(String[] args) {
        System.out.println(countVowels("Hello"));
    }
}
