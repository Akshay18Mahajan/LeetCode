class Solution {
     public boolean isVowel(char ch) {
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || 
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U');
    }

    public boolean halvesAreAlike(String s) 
    {
          int n=s.length();
          int mid=n/2;
          int i=0;
          int j=mid;

          int cntA=0;
          int cntB=0;

   
        while(i < n/2 && j < n) {
            if(isVowel(s.charAt(i)))  cntA++;
            
            if(isVowel(s.charAt(j)))  cntB++;
            
            i++;
            j++;
        }
        
        
        return cntA== cntB;
    }
}