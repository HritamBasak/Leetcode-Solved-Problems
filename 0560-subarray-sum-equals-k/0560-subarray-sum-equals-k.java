class Solution 
{
    public int subarraySum(int[] nums, int k) 
    {
     HashMap<Integer,Integer> map=new HashMap<>();
     int c=0;
     int sum=0;
     for(int i=0;i<nums.length;i++)
     {
        sum+=nums[i];
        if(sum==k)
        c++;

        if(map.containsKey(sum-k))
        c=c+map.get(sum-k);

        map.put(sum,map.getOrDefault(sum,0)+1);
     }
     return c;
    }
}