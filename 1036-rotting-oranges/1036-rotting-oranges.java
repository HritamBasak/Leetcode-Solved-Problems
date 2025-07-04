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
    public int orangesRotting(int[][] grid) {
      int f=0;
      int time=0;
      Queue<Pair> q=new LinkedList<>();
      for(int i=0;i<grid.length;i++)
      {
        for(int j=0;j<grid[0].length;j++)
        {
            if(grid[i][j]==2)
            q.add(new Pair(i,j));

            if(grid[i][j]==1)
            f++;
        }
      }

      int dRows[]={-1,0,1,0};
      int dCols[]={0,1,0,-1};

      while(!q.isEmpty() && f>0)
      {
        int size=q.size();
        for(int i=0;i<size;i++)
        {
            Pair p=q.poll();
            int row=p.f;
            int col=p.s;
            for(int d=0;d<4;d++)
            {
                int rows=row+dRows[d];
                int cols=col+dCols[d];
                if(rows>=0 && cols>=0 && rows<grid.length && cols<grid[0].length && grid[rows][cols]==1)
                {
                    q.add(new Pair(rows,cols));
                    f--;
                    grid[rows][cols]=2;
                }
            }
        }
        time++;
      }
      System.out.println(f);
      return f==0?time:-1;
    }
}
