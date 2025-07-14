class Solution {
    public int majorityElement(int[] nums) {
        // HashMap<Integer,Integer> map=new HashMap<>();
        // for(int i=0;i<nums.length;i++)
        // {
        //     map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        // }
        // for(int i:map.keySet())
        // {
        //     if(map.get(i)>(nums.length/2))
        //     return i;
        // }
        // return -1;
        
        //Moore's Voting Algo
        int ele=nums[0];

        int count=0;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==ele)
            {
                count++;
            }
            else
            count--;

            if(count==0)
            ele=nums[i+1];
        }
        return ele;
    }
}