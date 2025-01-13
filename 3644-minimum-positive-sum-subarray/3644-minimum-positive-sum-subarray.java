class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int left=0;
        int sum=0;
        int min=Integer.MAX_VALUE;
        for(int right=0;right<nums.size();right++)
        {
            sum+=nums.get(right);
            int s=sum;
            if(right>=(l-1) && right<=(r-1))
            {
                if(sum<min && sum>0)
                min=sum;
            }
            while(left<right)
            {
                s=s-nums.get(left);
                if((right-left)>=l && (right-left)<=r)
                {
                    if(s>0 && s<min)
                    min=s;
                }
                left++;
            }
            left=0;
        }
        return min==Integer.MAX_VALUE?-1:min;
    }
}