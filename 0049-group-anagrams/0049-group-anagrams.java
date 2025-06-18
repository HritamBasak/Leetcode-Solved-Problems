class Solution
 {
    public List<List<String>> groupAnagrams(String[] strs)
    {
//         Input: strs = ["eat","tea","tan","ate","nat","bat"]
//         Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
      List<List<String>> list=new ArrayList<>();
      HashMap<String,List<String>> map=new HashMap<>();
      for(int i=0;i<strs.length;i++)
      {
        char arr[]=strs[i].toCharArray();
        Arrays.sort(arr);
        String s=new String(arr);
        if(!map.containsKey(s))
        {
            map.put(s,new ArrayList<>());
        }
        map.get(s).add(strs[i]);
      }
      for(String i:map.keySet())
      {
        list.add(map.get(i));
      }
      return list;
    }
}