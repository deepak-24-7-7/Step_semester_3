import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Problem03_DuplicateCheck {

    static boolean hasDuplicate(List<String> transactionIds) {
        Set<String> seen = new HashSet<>(Math.max(16, (int) (transactionIds.size() / 0.75f) + 1));
        for (String id : transactionIds) {
            if (!seen.add(id)) return true;
        }
        return false;
    }

    static boolean hasDuplicateLowMemory(String[] transactionIds) {
        String[] copy = transactionIds.clone();
        Arrays.sort(copy);
        for (int i = 1; i < copy.length; i++) {
            if (copy[i].equals(copy[i - 1])) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasDuplicate(Arrays.asList("TXN1001", "TXN1002", "TXN1003", "TXN1002", "TXN1004")));
        System.out.println(hasDuplicate(Arrays.asList("TXN2001", "TXN2002", "TXN2003")));
        System.out.println(hasDuplicateLowMemory(new String[] {"TXN1001", "TXN1002", "TXN1001"}));
    }
}
