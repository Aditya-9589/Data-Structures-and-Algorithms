
// Q -> Product of digits of a number ?

// -->  Same peeling pattern as Q10 and Q11 — but now we multiply instead of add. 
//          The recurrence: productDigits(n) = (n % 10) × productDigits(n / 10).

// -->  Critical base case change: we return 1, NOT 0. Why? Because the identity element 
//          for multiplication is 1. Returning 0 would make every product 0.

// -->  Watch out for zeros in the number! If any digit is 0, the entire product 
//          becomes 0. That's mathematically correct (0 × anything = 0), 
//          but worth noting when debugging.

import java.util.*;

public class question_13 {

    static int digitProduct(int n) {
        if ( n == 0) return 1;

        return (n % 10) * digitProduct(n / 10);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = scn.nextInt();
        System.out.println("Digit product : " + digitProduct(n));
    }
}
