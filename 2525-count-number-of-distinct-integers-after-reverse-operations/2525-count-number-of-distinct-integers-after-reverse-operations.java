class Solution {
    public int countDistinctIntegers(int[] nums) {
        int arr[]=new int[2*nums.length];
        for(int i=0;i<nums.length;i++)
        {
            arr[i]=nums[i];
        }
        for(int i=0;i<nums.length;i++)
        {
            int s=0;
            while(nums[i]>0)
            {   
                int r=nums[i]%10;
                s=s*10+r;
                nums[i]=nums[i]/10;
            }
            arr[nums.length+i]=s;
        }
        Set<Integer> set=new HashSet<>();
        for(int i:arr)
        {
            System.out.println(i);
            set.add(i);
        }
        return set.size();
    }
}