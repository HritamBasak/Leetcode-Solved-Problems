class Solution {
    public int deleteGreatestValue(int[][] grid) {
        for(int r[]:grid)
        {
            Arrays.sort(r);
        }
        int sum=0;
        for(int i=0;i<grid[0].length;i++)
        {
            int max=Integer.MIN_VALUE;
            for(int j=0;j<grid.length;j++)
            {
                if(grid[j][i]>max)
                {
                    max=grid[j][i];
                }
            }
            sum=sum+max;
        }
        return sum;
    }
}