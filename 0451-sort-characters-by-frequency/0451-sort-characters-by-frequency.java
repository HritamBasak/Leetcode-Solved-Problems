class Solution 
{
    public static Map<Character,Integer> sort(Map<Character,Integer> map2)
	{
		//Converting map into a list
		List<Map.Entry<Character,Integer>> list=new ArrayList<>(map2.entrySet());
		
		//Soting the list
		Collections.sort(list,new Comparator<Map.Entry<Character,Integer>>()
				{
			         public int compare(Map.Entry<Character,Integer> o1,Map.Entry<Character,Integer> o2)
			         {
			        	 return o1.getValue().compareTo(o2.getValue());
			         }
				});
		Map<Character,Integer> m1=new LinkedHashMap<>();
		for(Map.Entry<Character,Integer> m:list)
		{
			m1.put(m.getKey(),m.getValue());
		}
		
		return m1;
	}
    public String frequencySort(String s) 
    {
     Map<Character,Integer> map=new HashMap<>();
	  for(int i=0;i<s.length();i++)
	  {
		  map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
	  }

       Map<Character,Integer> map1=sort(map);

       String str="";
	  for(Map.Entry<Character,Integer> m2:map1.entrySet())
	  {
		  //System.out.println(m2.getKey()+":"+m2.getValue());
		  int c=1;
		  while(c<=m2.getValue())
		  {
			  str=str+Character.toString(m2.getKey());
			  c++;
		  }
	  }
      StringBuilder s1=new StringBuilder(str);
      return s1.reverse().toString();
    }
}