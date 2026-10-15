import java.util.*;

public class Main {
    static int countInBand(int[] scores, int low, int high) {
        return upper(scores, high) - lower(scores, low);
    }

    static int lower(int[] a, int x) {
        int l = 0, r = a.length;
        while (l < r) {
            int m = (l + r) / 2;
            if (a[m] < x) l = m + 1;
            else r = m;
        }
        return l;
    }

    static int upper(int[] a, int x) {
        int l = 0, r = a.length;
        while (l < r) {
            int m = (l + r) / 2;
            if (a[m] <= x) l = m + 1;
            else r = m;
        }
        return l;
    }

    public static void main(String[] args) {
        int[] scores = {35, 42, 42, 50, 58, 58, 58, 63, 71, 88};
        System.out.println(countInBand(scores, 42, 58));
    }
}
