public class questions_2 {

    static int counter = 1;     // shared counter - persistes across calls

    static void print() {
        if (counter > 5) return;

        System.out.println(counter);
        counter++;
        print();
    }

    public static void main(String[] args) {
        print();
    }
}
