class Solution 
{
    public int[] topKFrequent(int[] nums, int k) 
    {
      Map<Integer,Integer> map=new HashMap<>();
      for(int i=0;i<nums.length;i++)
      {
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
      }
      Map<Integer,ArrayList<Integer>> m1=new HashMap<>();
      for(Map.Entry<Integer,Integer> e:map.entrySet())
      {
        ArrayList<Integer> list1=new ArrayList<>();
        if(m1.get(e.getValue())==null)
        {
            list1.add(e.getKey());
            m1.put(e.getValue(),list1);
        }
        else
        {
            list1=m1.get(e.getValue());
            list1.add(e.getKey());
            m1.put(e.getValue(),list1);
        }
      }
      //System.out.print(m1);
      ArrayList<Integer> list=new ArrayList<>();
      for(Map.Entry<Integer,ArrayList<Integer>> m:m1.entrySet())
      {
        list.addAll(m.getValue());
      }
      int arr[]=new int[k];
      int i=0;
      while(i<k)
      {
        arr[i]=list.get(list.size()-i-1);
        i++;
      }
      return arr;
    }
}