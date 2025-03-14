import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BigDec {
    public static void main(String[] args) {
        // Read input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];

        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();

        // Sorting using BigDecimal while maintaining the original format
        Arrays.sort(s, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                BigDecimal bdA = new BigDecimal(a);
                BigDecimal bdB = new BigDecimal(b);
                return bdB.compareTo(bdA); // Sorting in descending order
            }
        });

        // Print the sorted array
        for (String num : s) {
            System.out.println(num);
        }
    }
}
