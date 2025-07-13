import java.util.*;
public class Day5 {
    public static void main(String[] args) {
        int m = 5, n = 42;

        int nsize = 0;
        int temp = n;
        while (temp > 0) {
            nsize++;
            temp /= 10;
        }

        for (int i = m; i <= n; i++) {
            int count = 0, x = i;
            while (x > 0) {
                count++;
                x /= 10;
            }

            int Zeros= nsize - count;
            for (int j = 0; j < Zeros; j++) {
                System.out.print("0");
            }
            System.out.println(i);
        }
    }
}
