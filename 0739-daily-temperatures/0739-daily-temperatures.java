class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        // int res[]=new int[temperatures.length];
        // for(int i=0;i<temperatures.length-1;i++)
        // {
        //     int j=i+1;
        //     while( j<temperatures.length && temperatures[i]>=temperatures[j])
        //     {
        //         j++;
        //     }
        //     if(j<temperatures.length)
        //     res[i]=j-i;
        //     else
        //     res[i]=0;
        // }
        // res[temperatures.length-1]=0;
        // return res;
        Stack<Integer> st=new Stack<Integer>();
        int res[]=new int[temperatures.length];
        int n=temperatures.length;
        int diff=0;
        for(int i=n-1;i>=0;i--)
        {
            while(!st.isEmpty() && temperatures[i]>=temperatures[st.peek()])
            {
                st.pop();
            }
            if(!st.isEmpty())
            {
                diff=st.peek()-i;
                res[i]=diff;
            }
            st.push(i);
        }
        return res;
    }
}