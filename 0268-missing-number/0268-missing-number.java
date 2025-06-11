class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int i=0;
        while(i<n)
        {
            int c=nums[i];
            if(nums[i]<n && nums[i]!=nums[c])
            {
                int temp=nums[i];
                nums[i]=nums[c];
                nums[c]=temp;
            }
            else
            i++;
        }
        for(int k:nums)
        System.out.print(k+" ");
        for(int j=0;j<n;j++)
        {
            if(nums[j]!=j)
            {
                return j;
            }
        }
        return n;
    }
}