class Pair
{
    int f;
    int s;
    Pair(int f,int s)
    {
        this.f=f;
        this.s=s;
    }
}
class Solution {
    public void bfs(int row,int col,char grid[][],int vis[][])
    {
        vis[row][col]=1;
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(row,col));
        int m=grid.length;
        int n=grid[0].length;
        while(!q.isEmpty())
        {
            int r=q.peek().f;
            int c=q.peek().s;
            q.remove();
            for(int delrow=-1;delrow<=1;delrow++)
            {
                for(int delcol=-1;delcol<=1;delcol++)
                {
                    if(Math.abs(delrow)+Math.abs(delcol)==1)
                    {
                    int rows=delrow+r;
                    int cols=delcol+c;
                    if(rows>-1 && cols>-1 && rows<m && cols<n && vis[rows][cols]==0 && grid[rows][cols]=='1')
                    {
                        vis[rows][cols]=1;
                        q.add(new Pair(rows,cols));
                    }
                    }
                }
            }
        }
    }
    public int numIslands(char[][] grid) {
        int vis[][]=new int[grid.length][grid[0].length];
        int m=grid.length;
        int n=grid[0].length;
        int c=0;
        for(int row=0;row<m;row++)
        {
            for(int col=0;col<n;col++)
            {
                if(vis[row][col]==0 && grid[row][col]=='1')
                {
                    c++;
                    bfs(row,col,grid,vis);
                }
            }   
        }
        return c;
    }
}