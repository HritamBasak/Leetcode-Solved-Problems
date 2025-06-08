class Solution {
    public String firstPalindrome(String[] words) {
        String str="";
        int left=0;
        for(int i=0;i<words.length;i++)
        {
            int right=words[i].length()-1;
            while(left<=right)
            {
                if(words[i].charAt(left)!=words[i].charAt(right))
                break;
                left++;
                right--;
            }
            if(left>right)
            return words[i];

            left=0;
        }
        return "";
    }
}