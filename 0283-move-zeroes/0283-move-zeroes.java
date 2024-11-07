class Solution {
    public void moveZeroes(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> list1=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            list.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            list1.add(nums[i]);
        }
        for(int i=0;i<list.size();i++)
        {
            nums[i]=list.get(i);
        }
        for(int i=list.size();i<nums.length;i++)
        {
            nums[i]=list1.get(i-list.size());
        }
        for(int i:nums)
        {
            System.out.println(i);
        }
    }
}