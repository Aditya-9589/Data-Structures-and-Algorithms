
// Q -> Sum of digits of a number ?

// -->  Pattern is almost identical to Q10 — instead of adding 1 per digit, we add the 
//         actual digit value (n % 10) per level.

// -->  Recurrence: sumDigits(n) = (n % 10) + sumDigits(n / 10). The last digit is peeled off 
//         and added; the rest is handled recursively.

// -->  A well-known property: a number is divisible by 9 if its digit sum is divisible by 9. 
//         This recursive function is the engine behind that check!


import java.util.Scanner;


public class question_12 {

    static int sumDigits(int n) {
        if (n == 0) return 0;

        return (n % 10) + sumDigits(n / 10);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = scn.nextInt();
        System.out.println("Digits sum " + " = " + sumDigits(Math.abs(n)));
    }
}
