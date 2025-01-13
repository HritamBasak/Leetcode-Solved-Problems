class Solution {
    public int pivotInteger(int n) {
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        int div=sum/2;
        int s=0;
        int ans=-1;
        for(int i=1;i<=n;i++)
        {
            s=s+i;
            System.out.println(s);
            if(s>=div)
            {
            ans=i;
            break;
            }
        }
        int s2=0;
        for(int i=n;i>=ans;i--)
        {
            s2=s2+i;
        }
        return s==s2?ans:-1;
    }
}