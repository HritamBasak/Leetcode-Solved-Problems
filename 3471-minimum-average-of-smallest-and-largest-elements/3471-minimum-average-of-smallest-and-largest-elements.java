class Solution {
    public double minimumAverage(int[] nums) {
        double min=Double.MAX_VALUE;
        Arrays.sort(nums);
        //1 3 4 4 7 8 13 15
        int right=nums.length-1;
        for(int i=0;i<nums.length;i++)
        {
            double avg=(nums[i]+nums[right])/2.0;
            min=Math.min(avg,min);
            right--;
        }
        return min;
    }
}