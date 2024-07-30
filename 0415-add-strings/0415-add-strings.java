class Solution {
    public String addStrings(String num1, String num2) {
        int size1=num1.length(),size2=num2.length();
        int carry=0;
        int sum=0;
        String res="";
        while(size1!=0 || size2!=0)
        {
            sum+=carry;
            if(size1!=0)
            {
                sum=sum+(num1.charAt(size1-1)-'0');
                size1--;
            }
            if(size2!=0)
            {
                sum=sum+(num2.charAt(size2-1)-'0');
                size2--;
            }
            carry=sum/10;//1
            res=res+Integer.toString(sum%10);//335
            sum=0;
        }
        if(carry==1)
        res=res+"1";
        StringBuilder str=new StringBuilder(res); 
        return str.reverse().toString();
    }
}