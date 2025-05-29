class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        int s=0;
        int res=0;
        for(int i=0;i<tokens.length;i++)
        {
            String str=tokens[i];
            if(!str.equals("+") && !str.equals("*") && !str.equals("-") && !str.equals("/"))
            {
                res=Integer.parseInt(str);
                st.push(res);
            }
            if(str.equals("+"))
            {
                int s1=st.pop();
                int s2=st.pop();
                s=s2+s1;
                st.push(s);
            }
            if(str.equals("-"))
            {
                int s1=st.pop();
                int s2=st.pop();
                s=s2-s1;
                st.push(s);
            }
            if(str.equals("*"))
            {
                int s1=st.pop();
                int s2=st.pop();
                s=s2*s1;
                st.push(s);
            }
            if(str.equals("/"))
            {
                int s1=st.pop();
                int s2=st.pop();
                s=s2/s1;
                st.push(s);
            }
        }
        return st.peek();
    }
}