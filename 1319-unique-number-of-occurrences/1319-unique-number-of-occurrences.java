class Solution 
{
    public boolean uniqueOccurrences(int[] arr) 
    {
      Map<Integer,Integer> map=new LinkedHashMap<>();
      for(int i=0;i<arr.length;i++)
      {
        map.put(arr[i],map.getOrDefault(arr[i],0)+1);
      }   
      ArrayList<Integer> list=new ArrayList<>();
      for(int i:map.keySet())
      {
        list.add(map.get(i));
      }
      Set<Integer> set=new HashSet<>(list);
      if(set.size()==list.size())
      return true;
      else 
      return false;
    }
}