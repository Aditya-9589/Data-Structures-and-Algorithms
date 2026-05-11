import java.util.*;
import java.lang.*;


// Q -> Print 1 to n AFTER the recursive call. 
// ANS -> Magic trick time! By placing the print after the recursive call, the output reverses — you get ascending order even though we recurse downward.
//         Why? The recursive calls go all the way to the base case first. Then, as each call returns, it prints its n. Since n=1 returns first, then n=2, etc., we see 1, 2, 3... in order.
//         This is called post-order execution — work happens on the way back up the stack, not on the way down. This exact pattern is used in post-order tree traversal in DSA!

public class question_3 {
    
    static void print(int n) {
        if (n == 0) return;  // base case 

        print(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        print(5);
    }

}
