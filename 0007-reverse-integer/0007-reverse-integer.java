class Solution
{
    public int reverse(int x) 
    {  
     int rev=0;
     String res="";
     String str=Integer.toString(x);//123
     if(x<0)
     {
        String sub=str.substring(1,str.length());//123
        StringBuilder s=new StringBuilder(sub);
        res=Character.toString(str.charAt(0))+s.reverse().toString();//-321
        try{
            rev=Integer.parseInt(res);
        }
        catch(NumberFormatException e)
        {
            return 0;
        }
        return rev;
     }
    StringBuilder s1=new StringBuilder(str);
    res=s1.reverse().toString();
    System.out.println(res);
    // while(res.charAt(0)=='0')
    // {
    //     res=res.substring(1,res.length());
    // }
        try{
            rev=Integer.parseInt(res);
        }
        catch(NumberFormatException e)
        {
            return 0;
        }
        return rev;
    }
}