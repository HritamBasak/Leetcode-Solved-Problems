class Solution 
{
    public int numOfSubarrays(int[] arr, int k, int threshold) 
    {
      int g=0;
      int avg=0;
      int sum=0,c=0;
      int j=0;
      for(int i=0;i<arr.length;i++)
      {
        sum=sum+arr[i];
        g++;
        if((g-j)==k)
        {
            System.out.println(sum+" ");
            avg=(sum/k);
            if(avg>=threshold)
            c++;
            sum=sum-arr[j];
            j++;
        }
      }    
      return c;
    }
}