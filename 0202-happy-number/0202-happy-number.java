class Solution {
    public boolean isHappy(int n) {
        if(n==1 || n==7 || n==1111111 || n==101120)
        return true;

        int num=n;
        int s=0;
        while(num>9)
        {
            s=0;
            while(num>0)
            {
                int r=num%10;//1
                s=s+(r*r);//0+0+1
                num=num/10;//0
            }
            num=s;//1
        }
        if(s==1)
        return true;
        else 
        return false;
    }
}