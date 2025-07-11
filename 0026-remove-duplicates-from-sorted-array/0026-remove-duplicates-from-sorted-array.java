class Solution {
    public int removeDuplicates(int[] nums) {
        int var=1;
       for(int i=1;i<nums.length;i++)
       {
        if(nums[i-1]!=nums[i])
        {
            nums[var]=nums[i];
            var++;
        }
       }
       return var;
    }
}