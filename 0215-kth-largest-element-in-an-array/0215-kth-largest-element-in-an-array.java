class Solution
{
    public int findKthLargest(int[] nums, int k) 
    {
        //By sorting
        //Arrays.sort(nums);
        //return nums[nums.length-k];


        //By TreeMap
        /*Map<Integer,Integer> map=new TreeMap<>(Collections.reverseOrder());
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int s=0;
        int ans=0;
        for(int i:map.keySet())
        {
            s=s+map.get(i);
            if(s>=k)
            {
              ans=i;
              break;
            }
        }
        return ans;*/
        
        //By Priority Queue
        PriorityQueue<Integer> q=new PriorityQueue<>();
        for(int i=0;i<k;i++)
        {
            q.add(nums[i]);
        }
        for(int i=k;i<nums.length;i++)
        {
            if(q.peek()<nums[i])
            {
                q.poll();
                q.add(nums[i]);
            }
        }
        return q.peek();
    }
}