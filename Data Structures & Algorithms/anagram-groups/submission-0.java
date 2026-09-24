class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hm = new HashMap<>();

        for (String str : strs) {
            int[] count = new int[26];

            for (int j = 0; j < str.length(); j++) {
                count[str.charAt(j) - 'a']++;
            }

            String key = Arrays.toString(count);

            hm.putIfAbsent(key, new ArrayList<>());
            hm.get(key).add(str);
        }

        return new ArrayList<>(hm.values());
    }
}