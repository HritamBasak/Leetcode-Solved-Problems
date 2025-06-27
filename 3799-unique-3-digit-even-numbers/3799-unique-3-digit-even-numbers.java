class Solution {
    public ArrayList<String> subsets(String p,String up)
    {
        if(p.length()==3)
        {
            ArrayList<String> l=new ArrayList<>();
            l.add(p);
            return l;
        }
        ArrayList<String> res=new ArrayList<>();
        for(int i=0;i<up.length();i++)
        {
            char ch=up.charAt(i);
            ArrayList<String> list=subsets(p+ch,up.substring(0,i)+up.substring(i+1));
            res.addAll(list);
        }
        return res;
        
    }
    public int totalNumbers(int[] digits) {
        String up="";
        for(int i:digits)
        {
            up=up+Integer.toString(i);
        }
        String p="";
        ArrayList<String> ans=subsets(p,up);
        // for(String i:ans)
        // {
        //     System.out.println(i);
        // }
        Set<String> set=new HashSet<>();
        for(String i:ans)
        {
            if(Integer.parseInt(i)%2==0 && i.charAt(0)!='0')
            set.add(i);
        }
        return set.size();
    }
}