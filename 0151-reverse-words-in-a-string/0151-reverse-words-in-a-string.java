class Solution {
    public String reverseWords(String s) {
         s = s.trim();
        String[] arr = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = arr.length - 1; i >= 0; i--) {
               if (!arr[i].equals("")) {
                result.append(arr[i]).append(" ");
            }
        }
      return result.toString().trim();
    }
}
