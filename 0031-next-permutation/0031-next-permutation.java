class Solution {
    public void nextPermutation(int[] nums) {
        int l=nums.length;//4
        int index=-1;
        for(int i=l-1;i>0;i--)//2->0
        {
            if(nums[i-1]<nums[i])//
            {
                index=i-1;//1
                break;
            }
        }
        System.out.println(index);
        int ind=-1;
        if(index!=-1)
        {
            int max=nums[index+1];//3
            for(int i=index+1;i<l;i++)
            {
                if(nums[i]>nums[index])
                {
                    max=Math.min(max,nums[i]);//
                    ind=i;//2
                }
            }
            swap(nums,index,ind);//1,2
        }
        reverse(nums,index+1,l-1);
    }
    public void swap(int nums[],int index,int l)
    {
        int temp=nums[index];
        nums[index]=nums[l];
        nums[l]=temp;
    }
    public void reverse(int nums[],int l,int r)
    {
        while(l<r)
        {
            int temp=nums[l];
            nums[l]=nums[r];
            nums[r]=temp;
            l++;
            r--;
        }
    }
}