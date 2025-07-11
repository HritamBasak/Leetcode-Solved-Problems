class Solution {
    public int missingNumber(int[] nums) {
        int res[]=new int[nums.length+1];
        for(int i=0;i<nums.length;i++)
        {
            res[nums[i]]++;
        }
        int c=0;
        for(int i=0;i<res.length;i++)
        {
            if(res[i]==0)
            c=i;
        }
        return c;
    }
}