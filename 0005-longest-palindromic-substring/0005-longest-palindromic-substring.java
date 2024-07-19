class Solution 
{   
  public String longestPalindrome(String s) 
  {
    if(s.length()<=1)
    return s;
      String str="";
	  String max_str="";
	  int max=0;
	  for(int i=1;i<s.length();i++) 
	  {
        //For odd length
		  int low=i;
		  int high=i;
		  
		  while(s.charAt(low)==s.charAt(high))
		  {  
			  low--;
			  high++;
			  
			  if(low==-1 || high==s.length())
				  break;
		  }
			  str=s.substring(low+1,high);
			  if(str.length()>=max)
			  {
				  max=str.length();
				  max_str=str;//BAB
			  }
		  //For even length
		  low=i-1;
		  high=i;
		  
		  while(s.charAt(low)==s.charAt(high))
		  {
			  low--;
			  high++;
			  
			  if(low==-1 || high==s.length())
				  break;
		  }
			  str=s.substring(low+1,high);
			  if(str.length()>max)
			  {
				  max=str.length();
				  max_str=str;
			  }
	  }
    return max_str;
  }
}