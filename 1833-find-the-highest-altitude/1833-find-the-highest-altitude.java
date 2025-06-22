class Solution {
    public int largestAltitude(int[] gain) {
        int res[]=new int[gain.length+1];
        res[0]=0;
        int max=0;
        for(int i=1;i<gain.length;i++)
        {
            res[i]=res[i-1]+gain[i-1];
            max=Math.max(max,res[i]);
        }
        res[gain.length]=res[gain.length-1]+gain[gain.length-1];
        return Math.max(max,res[gain.length]);
    }
}