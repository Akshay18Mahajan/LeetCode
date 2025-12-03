class Solution {
public:
    bool checkIfPangram(string sentence) 
    {
         vector<int> arr(26, 0);

         int cnt=0;
         for(char ch:sentence)
         {
            int index=ch-'a';
            if(arr[index]==0)
            {
                arr[index]++;
                cnt++;
            }
         }
         return cnt==26;
    }
};