class Solution {
    public int findMin(int[] nums) {
        int lo = 0;
        int hi = nums.length - 1;
        int result = nums[0];

        while (lo <= hi) {
            // if this range is already sorted, min is at lo
            if (nums[lo] <= nums[hi]) {
                result = Math.min(result, nums[lo]);
                break;
            }

            int mid = lo + (hi - lo) / 2;
            result = Math.min(result, nums[mid]);

            if (nums[mid] >= nums[lo]) {
                // left half is sorted, min must be in right half
                lo = mid + 1;
            } else {
                // right half is sorted, min must be in left half
                hi = mid - 1;
            }
        }

        return result;
    }
}