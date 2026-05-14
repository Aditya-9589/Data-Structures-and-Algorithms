
// Q -> Print even numbers from 1 to n using recursion.

// -->  We recurse from n down to 1, but only print if the current number is even 
//         (n % 2 == 0). The recursion structure is identical to Q1/Q2 — we just 
//         add a condition before printing.

// -->  Print AFTER recursing so output comes in ascending order (small to large). 
//         If you printed before recursing, you'd get descending even numbers.

// -->  There's also an elegant version that steps by 2 directly — 
//         skipping odd numbers entirely rather than checking. Both are shown below.

import java.util.Scanner;

public class question_8 {

    // Version 1: check every number, skip odds
    // static void printEvens(int n) {
    //     if (n == 0) return;

    //     printEvens(n - 1);              // Recurse down first (ascending output)
    //     if (n % 2 == 0) {
    //         System.out.println(n);      // Print only if even
    //     }
    // }


    // Version 2: step by 2 — only visit even numbers
    static void printEvens(int n) {
        if ( n <= 0) return;

        printEvens(n - 2);
        System.out.println(n);
    }


    public  static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter n value: ");
        int n = scn.nextInt();

        System.out.println("Enter even numbers upto " + n + ":");
        printEvens(n);

        scn.close();
    }
}
