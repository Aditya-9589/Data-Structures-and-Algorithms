
// Q 7 -> Recursive function that stops only when n == 0.

// -->  This drills the most important concept in recursion: the base case must be 
//         exact. Using n == 0 means we only stop when n is exactly zero. 
//         If someone calls with a negative number, it recurses forever!
// -->  The safer version checks n <= 0. However, understanding the difference is 
//         critical — many real bugs come from an off-by-one in the base case.
// -->  We also show a safe version that throws an exception for invalid input. 
//         In production DSA code, you always protect your recursion from bad inputs
//         — never assume the caller is well-behaved.

public class question_7 {

    static void countdown(int n) {
        if (n < 0) throw new IllegalArgumentException("n must be greate than 0");
        if (n == 0) {
            System.out.println("Reached 0, stopping");
            return;
        }

        System.out.println("n = " + n);
        countdown(n - 1);
    }

    public static void main(String[] args) {
        countdown(5);
    }
}
