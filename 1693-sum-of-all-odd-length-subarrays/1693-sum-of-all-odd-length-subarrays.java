class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int left=0;
        int sum=0;
        int min=0;
        int totalSum=0;
        for(int right=0;right<arr.length;right++)
        {
            sum+=arr[right];
            int s=sum;
            if((right+1)%2!=0)
            {   
                totalSum+=sum;
            }
            while(left<right)
            {
                s=s-arr[left];
                left++;
                if((right-left)%2==0)
                totalSum=totalSum+s;
            }
            left=0;
        }
        return totalSum;
    }
}