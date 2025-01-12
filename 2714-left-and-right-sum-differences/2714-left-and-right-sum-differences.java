class Solution {
    public int[] leftRightDifference(int[] nums) {
        int ans[]=new int[nums.length];
        int left[]=new int[nums.length];
        int right[]=new int[nums.length];
        int leftSum=0,rightSum=0;
        left[0]=0;
        right[nums.length-1]=0;
        for(int i=1;i<nums.length;i++)
        {
            leftSum=leftSum+nums[i-1];
            left[i]=leftSum;
        }
        for(int i=nums.length-2;i>=0;i--)
        {
            rightSum=rightSum+nums[i+1];
            right[i]=rightSum;
        }
        for(int i:right)
        {
            System.out.println(i);
        }
        for(int i=0;i<nums.length;i++)
        {
            ans[i]=Math.abs(left[i]-right[i]);
        }
        return ans;
    }
}