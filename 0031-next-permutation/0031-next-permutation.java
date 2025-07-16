class Solution {
    public void swap(int nums[],int i,int j)
    {
        int t=nums[i];
        nums[i]=nums[j];
        nums[j]=t;
    }
    public void nextPermutation(int[] nums) {
        int l=nums.length;
        int index=-1;
        for(int i=l-1;i>0;i--)
        {
            if(nums[i]>nums[i-1])
            {
                index=i-1;
                break;
            }
        }
        if(index==-1)
        {
            for(int i=0;i<l/2;i++)
            {
                swap(nums,i,l-1-i);
            }
        }
        else
        {
            int num=nums[index];//3
            int max=nums[index+1];//5
            int in=index;
            for(int i=index+1;i<l;i++)
            {
                if(nums[i]>num && nums[i]<=max)
                {
                    max=nums[i];
                    in=i;//
                }
            }
            swap(nums,index,in);

            // for(int i:nums)
            // System.out.println(i);
            //2 4 5 3 1 0 0
            int a = index + 1;
            int b = nums.length - 1;

            while (a < b) {
            int temp = nums[a];
            nums[a] = nums[b];
            nums[b] = temp;
            a++;
            b--;
            }
        }
    }
}