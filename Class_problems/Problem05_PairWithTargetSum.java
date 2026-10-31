import java.util.HashSet;
import java.util.Set;

public class Problem05_PairWithTargetSum {

    static boolean hasPairWithSum(int[] nums, int target) {
        Set<Integer> seen = new HashSet<>();
        for (int n : nums) {
            if (seen.contains(target - n)) return true;
            seen.add(n);
        }
        return false;
    }

    static boolean hasPairWithSumBruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasPairWithSum(new int[] {2, 7, 11, 15}, 9));
        System.out.println(hasPairWithSum(new int[] {3, 4, 6}, 20));
        System.out.println(hasPairWithSumBruteForce(new int[] {2, 7, 11, 15}, 9));
        System.out.println(hasPairWithSumBruteForce(new int[] {3, 4, 6}, 20));
    }
}
