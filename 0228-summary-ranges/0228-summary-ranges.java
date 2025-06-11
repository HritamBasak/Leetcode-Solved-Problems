class Solution {
    public List<String> summaryRanges(int[] nums) {
        
        List<String> list=new ArrayList<>();
        if(nums.length==0)
        {
            return list;
        }
        int cur=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]-nums[i-1]!=1)
            {
                if(nums[i-1]==cur)
                    list.add(String.valueOf(cur));
                else
                {
                    list.add(cur+"->"+nums[i-1]);
                }
                cur=nums[i];
            }
        }
        if(cur!=nums[nums.length-1])
        list.add(cur+"->"+nums[nums.length-1]);
        else
        list.add(String.valueOf(cur));
        return list;
    }
}