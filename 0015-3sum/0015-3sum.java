class Solution 
{
    public List<List<Integer>> threeSum(int[] nums) 
    {
      Set<List<Integer>> set=new HashSet<>();
      Arrays.sort(nums);
      for(int i=0;i<nums.length-2;i++)
      {
        int j=i+1;
        int k=nums.length-1;
        int s=0;
        while(j<k)
        {
           s=+nums[i]+nums[j]+nums[k];
           if(s==0)
           {
            set.add(Arrays.asList(nums[i],nums[j],nums[k]));
            k--;
            j++;
           }
           else if(s<0)
           {
            j++;
           }
           else
           k--;
        }
      }
      return new ArrayList<>(set);
    }
}