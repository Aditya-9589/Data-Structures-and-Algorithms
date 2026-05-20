
// Q -> Factorial of a number using recursion

// --> Factorial (written n!) means: multiply all integers from 1 up to n. 
//         So 5! = 5 × 4 × 3 × 2 × 1 = 120.

// --> Recurrence: fact(n) = n × fact(n-1). Each call multiplies its own n by 
//         the factorial of everything below it. Base case: fact(0) = 1 
//         (by mathematical definition — multiplying nothing gives 1, not 0).

// --> Why base case is 1, not 0? Because we are multiplying. 
//         The identity element for multiplication is 1 (just like 0 is for addition).
//         If base returned 0, the whole product would be 0!

import java.util.*;   

public class question_10 {

    static long fact(int n) {
        if (n == 0 || n ==1) return 1;

        return n * fact(n - 1);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter n :");
        int n = scn.nextInt();
        System.out.println(fact(n));

        scn.close();
    }
}
