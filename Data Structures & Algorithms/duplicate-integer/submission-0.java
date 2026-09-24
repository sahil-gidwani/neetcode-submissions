class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int num : nums) {
            if (hm.containsKey(num)) {
                hm.put(num, hm.get(num) + 1);
            } else {
                hm.put(num, 1);
            } 
        }

        for (int value : hm.values()) {
            if (value > 1) {
                return true;
            }
        }

        return false;
    }
}