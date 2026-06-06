class Solution {
    public String frequencySort(String s) {
       String str="";
       HashMap<Character,Integer> map=new HashMap<>();
       for(int i=0;i<s.length();i++)
       {
        map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
       } 

       List<Map.Entry<Character,Integer>> list=new ArrayList<>(map.entrySet());
       list.sort((a,b)->b.getValue()-a.getValue());//e-2,t-2,r-2
       int c=1;
       for(Map.Entry<Character,Integer> m:list)
       {    
        while(c<=m.getValue())
        {
            str+=Character.toString(m.getKey());
            c++;
        }
        c=1;
       }
       return str;
    }
}