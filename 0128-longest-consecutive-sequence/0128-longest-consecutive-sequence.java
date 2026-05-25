class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
       HashSet<Integer> set=new HashSet<>();
       for(int i=0;i<nums.length;i++)
       {
        set.add(nums[i]);//1 0 2
       }
       Map<Integer,Boolean> map=new HashMap<>();
       int c=1;
       int max=1;
       for(int i:set)
       {
        if(!set.contains(i-1))
        {
            while(set.contains(i+c))
            {
                c++;
            }
            if(c>max)
            max=c;
            c=1;
        }
       }
       return max;
    }
}