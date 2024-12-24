class Solution {
    public void rotate(int[] nums, int k) {
        if(nums.length>1)
        {
        if(k>nums.length)
        k=k%nums.length;

        int n=nums.length-k;
        int a1[]=new int[nums.length];
        for(int i=n;i<nums.length;i++)
        {
            a1[i-n]=nums[i];
        }
        for(int i=0;i<nums.length-k;i++)
        {
            a1[i+k]=nums[i];
        }
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=a1[i];
        }
        }
    }
}