import com.sun.java_cup.internal.runtime.Scanner;
import java.util.*;

public class Coke {
    public static int drink(int n) {
        int total = 0;
        while(n > 2) {
            total = total + n/3;
            n = n/3 + n%3;
        }
        if(n == 2) {
            total = total + 1;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        while(sc.hasNext()) {
            n = sc.nextInt();
            System.out.println(drink(n));
        }
    }
}