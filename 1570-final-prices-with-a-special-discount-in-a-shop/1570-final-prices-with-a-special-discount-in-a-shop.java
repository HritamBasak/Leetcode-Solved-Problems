class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> st=new Stack<>();
        int res[]=new int[prices.length];
        for(int i=prices.length-1;i>=0;i--)
        {
            while(!st.isEmpty() && prices[i]<prices[st.peek()])
            {
                st.pop();
            }
            if(!st.isEmpty())
            {
                res[i]=prices[i]-prices[st.peek()];
            }
            else
            res[i]=prices[i];
            
            st.push(i);
        }
        return res;
    }
}