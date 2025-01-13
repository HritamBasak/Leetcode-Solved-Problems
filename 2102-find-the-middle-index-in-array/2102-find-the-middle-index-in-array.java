class Solution {
    public int findMiddleIndex(int[] nums) {
        int leftSum=0,rightSum=0;
        int index=-1;
        int left[]=new int[nums.length];
        int right[]=new int[nums.length];
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
        for(int i=0;i<nums.length;i++)
        {
            if(right[i]==left[i])
            {
            index=i;
            break;
            }
        }
        return index;
    }
}