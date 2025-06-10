class Solution {
    public int subarraySum(int[] nums) {
        int sum=nums[0];
        int diff=0;
        int total=nums[0];
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,nums[0]);
        for(int i=1;i<nums.length;i++)
        {
            sum+=nums[i];
            map.put(i,sum);
            diff=Math.max(0,i-nums[i]);
            if(diff==0)
            total+=sum;
            else
            total+=sum-map.get(diff-1);
        }
        return total;
    }
}