class Solution {
    public int missingNumber(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        int mis=0;
        for(int i=0;i<nums.length;i++)
        {
            list.add(nums[i]);
        }
        for(int i=0;i<=nums.length;i++)
        {
            if(!list.contains(i))
            mis=i;
        }
        return mis;
    }
}