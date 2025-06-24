class Solution {
    public void sortColors(int[] nums) {
        int c=0;
        for(int i:nums)
        {
           if(i==2)
           c++;
        }
        int left=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=2)
            {
                int temp=nums[i];
                nums[i]=nums[left];
                nums[left]=temp;
                left++;
            }
        }
        int right=0;
        for(int i=0;i<nums.length-c;i++)
        {
            if(nums[i]!=1)
            {
                int temp=nums[i];
                nums[i]=nums[right];
                nums[right]=temp;
                right++;
            }
        }
    }
}