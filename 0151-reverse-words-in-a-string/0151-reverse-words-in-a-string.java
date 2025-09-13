class Solution {
    public String reverseWords(String s) {
       String split[]=s.trim().split("\\s+");
       System.out.println(split.length);
       String res="";
       for(int i=split.length-1;i>=0;i--)
       {
        res+=split[i];
        res+=" ";
       }
       return res.substring(0,res.length()-1);
    }
}