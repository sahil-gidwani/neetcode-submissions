class Solution {
    public int search(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            // target found
            if (nums[mid] == target) {
                return mid;
            }

            // left half is sorted
            if (nums[mid] >= nums[lo]) {

                // target lies inside the sorted left half
                if (nums[lo] <= target && target < nums[mid]) {
                    hi = mid - 1;
                } else {
                    // target must be in the right half
                    lo = mid + 1;
                }

            } else {
                // right half is sorted

                // target lies inside the sorted right half
                if (nums[mid] < target && target <= nums[hi]) {
                    lo = mid + 1;
                } else {
                    // target must be in the left half
                    hi = mid - 1;
                }
            }
        }

        return -1;
    }
}