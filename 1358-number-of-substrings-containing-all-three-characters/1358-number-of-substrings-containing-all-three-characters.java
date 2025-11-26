class Solution {
    public int numberOfSubstrings(String s) 
    {
        int n = s.length();
        int left=0;
        int right=0;
        int cnt =0;
        Map<Character, Integer> mpp = new HashMap<>();

        while(right<n)
        {
            char chRight= s.charAt(right);
          mpp.put(chRight , mpp.getOrDefault(chRight ,0)+1);

           while(mpp.size()==3)
           {
            cnt=cnt+(n-right);

          char  charLeft= s.charAt(left);
            mpp.put(charLeft , mpp.get(charLeft)-1);

            if(mpp.get(charLeft)==0)
            mpp.remove(charLeft);
            left++;
           }
          right++;
        }
        return cnt;
    }
}