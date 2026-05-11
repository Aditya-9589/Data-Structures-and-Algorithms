
import java.util.*;
import java.lang.*;


// Q -> Print hello five times ?

public class example_1 {

    static void printHello(int n) {
        if (n == 0) return;

        System.out.println("Helllo");
        printHello(n - 1);
    }

    public static void main(String[] args) {
        printHello(5);
    }
}
