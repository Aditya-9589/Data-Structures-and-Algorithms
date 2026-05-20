
// =>  Q  -> Sum of first n natural numbers using recursion ?

// --> This is the first question with a return value — a huge step up! Instead of just 
//      printing, each recursive call computes and returns something.

// --> Recurrence relation: sum(n) = n + sum(n-1). In plain English: 
//      "the sum of first n numbers equals n plus the sum of the first (n-1) numbers." 
//      The base case: sum(0) = 0.

// --> Each stack frame holds its own n and waits for the result from sum(n-1) 
//      before it can compute n + result and return it upward. 
//      The final answer bubbles up to the original caller.

import java.util.*;
// import java.lang.*;

public class question_9 {

    // static void sum(int n) {
    static int sum(int n) {
        if (n == 0) return 0;

        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter n :");
        int n = scn.nextInt();
        System.out.println("Sum of 1 to " + n + " = " + sum(n));
    }
}
