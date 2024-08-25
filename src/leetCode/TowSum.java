package leetCode;

import java.util.Hashtable;

/**
 * TowSum
 */
public class TowSum {

    public static int[] twoSum(int[] nums, int target) {
        Hashtable<Integer, Integer> hashtable = new Hashtable<>();
        final int length = nums.length;
        for (int i = 0; i < length; ++i) {
            int neededNum = target - nums[i];

            if (hashtable.containsKey(neededNum)) {
                return new int[]{hashtable.get(neededNum), i};
            }
            hashtable.put(nums[i], i);

        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 26;
        int[] result1 = twoSum(nums1, target1);
        assert result1 != null;
        System.out.println("Output: [" + result1[0] + ", " + result1[1] + "]");
    }

}