class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        Map<Character, Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();

        for (char c : p.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);

        int count = map.size();
        int k = p.length();
        int start = 0, end = 0;

        while (end < s.length()) {
            char endChar = s.charAt(end);

            if (map.containsKey(endChar)) {
                map.put(endChar, map.get(endChar) - 1);
                if (map.get(endChar) == 0)
                    count--;
            }

            if (end - start + 1 < k) {
                end++;
            }
            else if (end - start + 1 == k) {

                if (count == 0)
                    ans.add(start);

                char startChar = s.charAt(start);

                if (map.containsKey(startChar)) {
                    map.put(startChar, map.get(startChar) + 1);
                    if (map.get(startChar) == 1)
                        count++;
                }

                start++;
                end++;
            }
        }

        return ans;
    }
}
