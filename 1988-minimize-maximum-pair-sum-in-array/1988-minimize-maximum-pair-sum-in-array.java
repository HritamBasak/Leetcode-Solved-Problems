class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int left=0;
        int max=0;
        for(int right=nums.length-1;right>=0;right--)
        {
            int sum=nums[left]+nums[right];
            max=Math.max(max,sum);
            left++;
        }
        return max;
    }
}