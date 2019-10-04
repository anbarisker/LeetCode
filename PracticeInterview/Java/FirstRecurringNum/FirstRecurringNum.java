import java.util.HashMap;
import java.util.HashSet;

public class FirstRecurringNum {

    public static void main(String[] args) {
        int[] nums = { 2, 5, 1, 2, 3, 5, 1, 2, 4 };
        System.out.println(firstRecurringNum(nums));
    }

    // Speed O(n) but memory is higher
    static int firstRecurringNum(int[] nums) {
        HashSet<Integer> hashNums = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (hashNums.contains(nums[i])) {
                return nums[i];
            } else {
                hashNums.add(nums[i]);
            }
        }
        return 0;
    }
}