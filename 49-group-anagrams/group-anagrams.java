class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Map<String, List<String>> map = new HashMap<>();

        // for (String str : strs) {
        //     char[] arr = str.toCharArray();
        //     Arrays.sort(arr);
        //     String key = new String(arr);

        //     if (!map.containsKey(key)) {
        //         map.put(key, new ArrayList<>());
        //     }

        //     map.get(key).add(str);
        // }

        // return new ArrayList<>(map.values());

        //   O(nmlogm)
        //   S(nm)

        //   Below : O(nm)
        //   S(nm)
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            int[] freq = new int[26];
            for (char c : s.toCharArray()) {
                freq[c - 'a']++;
            }

            StringBuilder key = new StringBuilder();
            for (int count : freq) {
                key.append("#").append(count);
            }

            map.computeIfAbsent(key.toString(), k -> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(map.values());
    }
}