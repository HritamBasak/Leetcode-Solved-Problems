class Solution 
{
    public int longestConsecutive(int[] nums) 
    {
        if(nums.length==0 || nums.length==1)
        return nums.length;

        Set<Integer> set=new HashSet<>();
        for(int i:nums)
        {
            set.add(i);
        }
        int c=1;
        int max=0;
        for(int i:set)//0 3 7 2 5 8 4 6 1
        {
            if(!set.contains(i-1))
            {
                while(set.contains(i+c))
                {
                    c++;//9
                }
                if(c>max)
                max=c;
                c=1;
            }
        }
        return max;
    }
}