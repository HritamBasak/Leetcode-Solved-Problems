class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int max=0;
        for(int i:map.keySet())
        {
            if(map.get(i)>max && map.get(i)>(nums.length/2))
            max=i;
        }
        return max;
    }
}