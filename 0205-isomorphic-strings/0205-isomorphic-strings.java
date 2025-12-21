class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Integer> mpp1 = new HashMap<>();
        HashMap<Character, Integer> mpp2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) 
        {
            if (!mpp1.containsKey(s.charAt(i))) 
            {
                mpp1.put(s.charAt(i), i);
            }

            if (!mpp2.containsKey(t.charAt(i)))
             {
                mpp2.put(t.charAt(i), i);
            }

            if (!mpp1.get(s.charAt(i)).equals(mpp2.get(t.charAt(i))))
             {
                return false;
            }
        }

        return true;        
    }
}