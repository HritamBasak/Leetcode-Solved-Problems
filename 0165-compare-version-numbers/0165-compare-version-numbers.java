class Solution {
    public int compareVersion(String version1, String version2) {
        // int c=0,c1=0;
        // for(int i=0;i<version1.length();i++)
        // {
        //     if(version1.charAt(i)=='.')
        //     c++;
        // }
        // for(int i=0;i<version2.length();i++)
        // {
        //     if(version2.charAt(i)=='.')
        //     c1++;
        // }
        // if(c!=c1) return 0;
        String split1[]=version1.split("\\.");
        String split2[]=version2.split("\\.");

        // for(String i:split1)
        // System.out.println(i);
        // for(String i:split2)
        // System.out.println(i);

        for(int i=0;i<Math.max(split1.length,split2.length);i++)
        {
            int a=i<split1.length?Integer.parseInt(split1[i]):0;
            int b=i<split2.length?Integer.parseInt(split2[i]):0;
            if(a<b) return -1;
            else if(a>b) return 1;
        }
        return 0;
    }
}