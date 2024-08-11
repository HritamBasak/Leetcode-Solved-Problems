class Solution {
    public int pivotIndex(int[] nums) {
        int leftsum[]=new int[nums.length];//Calculates the left sum of that element in the index
        int rightsum[]=new int[nums.length];//Calculates the left sum of that element in the index
        
        int s=0,s1=0;
        for(int i=0;i<nums.length;i++)
        {
            leftsum[i]=s;
            s=s+nums[i];
        }
         for(int i=nums.length-1;i>=0;i--)
        {
            rightsum[i]=s1;
            s1=s1+nums[i];
        }
        int index=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(leftsum[i]==rightsum[i])
            {
                index=i;
                break;
            }
        }
        return index;
    }
}