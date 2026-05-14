
// Q6 -> Print the current value of n during each recursive call. 

// -->  This is a debugging and tracing tool. Printing n before the recursive call 
//     shows you exactly what value n holds each time a new stack frame is created.
// -->  This pattern is used constantly when debugging recursive functions — 
//     you'll add a print like this to understand what your recursion is doing 
//     before it's even close to correct.
// -->  Notice the values go: 5 → 4 → 3 → 2 → 1. This confirms the call is indeed 
//     decrementing and will eventually reach 0 (the base case). 
//     Never skip adding trace prints when debugging recursion!

public class question_6 {

    static void trace(int n) {
        if (n == 0) {
            System.out.println(" n = 0, base case reached");
            return;
        }

        System.out.println("Entering recursive call: " + n);
        trace(n - 1);
        System.out.println("back from recursive call: " + n);

    }

    public static void main(String[] args) {
        trace(5);
    }
}
