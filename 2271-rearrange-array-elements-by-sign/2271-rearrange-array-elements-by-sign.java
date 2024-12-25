class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> list1=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
            list.add(nums[i]);
            else
            list1.add(nums[i]);
        }
        int ans[]=new int[nums.length];
        int a=0,b=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i%2==0)
            {
                ans[i]=list.get(a++);
            }
            else
            {
                ans[i]=list1.get(b++);
            }
        }
        return ans;
    }
}