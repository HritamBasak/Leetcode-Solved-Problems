class Solution 
{
    public int sum(int n)
    {
        int sum=0;
        while(n>0)
        {
            int r=n%10;
            sum=sum+r;
            n=n/10;
        }
        return sum;
    }
    public int countLargestGroup(int n) 
    {
      Map<Integer,Integer> map=new HashMap<>();
      int largestsum=0;
      for(int i=1;i<=n;i++)
      {
        int s=sum(i);
        map.put(s,map.getOrDefault(s,0)+1);
      }
      for(int m:map.keySet())
      {
        System.out.println(m+":"+map.get(m));
      }
      int highest=0;
      for(int m:map.keySet())
      {
        if(map.get(m)>highest)
        highest=map.get(m);
      }
      int c=0;
      for(int m:map.keySet())
      {
        if(map.get(m)==highest)
        c++;
      }
      return c;
    }
}