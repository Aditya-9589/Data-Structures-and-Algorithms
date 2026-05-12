public class question_5 {

    static void helper(int n) {
        if (n == 0) return;

        System.out.println(n);
        helper(n - 1);
    }

    static void run(int n) {
        System.out.println("START");
        helper(n);
        System.out.println("END");
    }

    public static void main(String[] args) { 
        run(5);
    }
}
