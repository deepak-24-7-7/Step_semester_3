import java.util.Scanner;
import java.util.Arrays;

public class QueueInOrder {

    static int firstBreak(int[] tokens) {
        for (int i = 1; i < tokens.length; i++) {
            if (tokens[i] < tokens[i - 1]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] tokens = new int[n];

        for (int i = 0; i < n; i++) {
            tokens[i] = sc.nextInt();
        }

        System.out.println("tokens = " + Arrays.toString(tokens));
        System.out.println("firstBreak = " + firstBreak(tokens));

        sc.close();
    }
}
