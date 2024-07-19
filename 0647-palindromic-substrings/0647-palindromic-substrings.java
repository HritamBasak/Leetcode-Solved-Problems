class Solution {
    public int countSubstrings(String s) {
        String max_str="";
        int c=0;
        for(int i=1;i<s.length();i++)
        {
            //For odd length
            int low=i;
            int high=i;

            while(s.charAt(low)==s.charAt(high))
            {
                c++;
                low--;
                high++;

                if(low==-1 || high==s.length())
                break;

                //max_str=s.substring(low+1,high);
            }

            //For even length
            low=i-1;
            high=i;

            while(s.charAt(low)==s.charAt(high))
            {
                c++;
                low--;
                high++;

                if(low==-1 || high==s.length())
                break;
            }
        }
        return c+1;
    }
}