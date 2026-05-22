
// Q -> Count zeroes in a number using recursion. 

// -->  Same peeling skeleton as Q10 (count digits) — but now we only add 1 when the 
//         peeled digit is 0. So: countZeros(n) = (1 if n%10==0 else 0) + countZeros(n/10).

// -->  Edge case to watch: the number 0 itself. If we call countZeros(0), the base case
//         triggers and returns 0 — but 0 has one zero digit! Handle this in main with 
//         a special check.

// -->  Also beware: leading zeros don't exist in integers. 0100 is stored as 100 — 
//         the leading zero is lost. Only zeros embedded in the number are counted correctly.

import java.util.*;


public class question_15 {

    static int countZeroes(int n) {
        if (n == 0) return 0;

        int lastDigit = n % 10;
        int zeroCount = (lastDigit == 0) ? 1 : 0;

        return zeroCount + countZeroes(n / 10);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = scn.nextInt();
        n = Math.abs(n);


        // Special case: the number zero itself has exactly 1 zero digit
        int result = (n == 0) ? 1 : countZeroes(n);
        System.out.println("Zero count = " + result);
    }
}
