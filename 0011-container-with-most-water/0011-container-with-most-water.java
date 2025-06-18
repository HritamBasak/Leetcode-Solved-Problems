class Solution {
    public int maxArea(int[] height) {
        int l=0,r=height.length-1;
        int max=0;
        while(l<=r)
        {
            if(height[l]<=height[r])
            {
                max=Math.max(height[l]*(r-l),max);
                l++;
            }
            else
            {
                max=Math.max(height[r]*(r-l),max);
                r--;
            }
        }
        return max;
    }
}