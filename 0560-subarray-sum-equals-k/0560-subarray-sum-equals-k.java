class Solution 
{
    public int subarraySum(int[] nums, int k) 
    {
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int c=0;
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            // if(sum==k)
            // c++;
            if(map.containsKey(sum-k))
            {
                c+=map.getOrDefault(sum-k,0);
                System.out.println(c+"");
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return c;
    }
}