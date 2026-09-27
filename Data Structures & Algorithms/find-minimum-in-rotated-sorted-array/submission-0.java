public class Solution {
    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        int res = nums[0];

        while (l <= r) {
            // In a non-rotated array l < r
            if (nums[l] < nums[r]) {
                res = Math.min(res, nums[l]);
                break;
            }

            int m = l + (r - l) / 2;
            res = Math.min(res, nums[m]);
            // l to m is sorted ie right side has the rotated part of min element
            if (nums[m] >= nums[l]) {
                l = m + 1;
            }
            // rotation happened before / at m
            else {
                r = m - 1;
            }
        }
        return res;
    }
}