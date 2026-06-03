
// Q -> Count frequecy of a given character. 

// Check if first char matches the target. Add 1 if yes, 0 if no. 
// Recurse on the rest — identical in shape to countVowels.

import java.util.*;
import java.lang.*;

public class question_20 {

    static int countFreq(String str, char target) {

        if (str.isEmpty())
            return 0;

        char first = str.charAt(0);
        int hit = (first == target) ? 1 : 0;

        return hit + countFreq(str.substring(1), target);
    }

    public static void main(String[] args) {
        int result = countFreq("bananaa", 'a');

        System.out.println(result);
    }
}
