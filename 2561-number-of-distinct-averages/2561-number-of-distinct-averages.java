class Solution {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        Set<Double> set=new HashSet<>();
        for(int i=0;i<nums.length/2;i++)
        {
            double avg=0.0;
            avg=(double)(nums[i]+nums[nums.length-1-i])/2;
            System.out.println(avg);
            set.add(avg);
        }
        return set.size();
    }
}