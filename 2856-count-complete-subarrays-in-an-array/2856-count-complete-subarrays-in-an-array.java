class Solution {
    public int countCompleteSubarrays(int[] nums) {
       Set<Integer> set=new HashSet<>();
       for(int i:nums)
       {
        set.add(i);
       }
       int size=set.size();
       int total=0;
       HashMap<Integer,Integer> map=new HashMap<>();
       int left=0;
       for(int i=0;i<nums.length;i++)
       {
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        while(map.size()==size)
        {
            total=total+(nums.length-i);//Main Observation
            map.put(nums[left],map.get(nums[left])-1);
            if(map.get(nums[left])==0)
            map.remove(nums[left]);
            left++;
        }
       }
       return total;
    }
}