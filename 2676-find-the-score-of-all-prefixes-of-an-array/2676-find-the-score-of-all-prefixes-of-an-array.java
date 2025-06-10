class Solution {
    public long[] findPrefixScore(int[] nums) {
        long sum=0;
        long max=0;
        long a[]=new long[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            max=Math.max(max,nums[i]);
            sum+=nums[i]+max;
            a[i]=sum;
        }
        return a;
    }
}