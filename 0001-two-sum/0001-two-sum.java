class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        int a[]=new int[]{-1,-1};
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++)
        {
            int c=target-nums[i];
            if(map.containsKey(c) && map.get(c)!=i)
            return new int[]{i,map.get(c)};
        }
        return new int[]{}; 
    }
}