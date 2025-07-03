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
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int vis[][]=new int[image.length][image[0].length];
        // for(int row=0;row<image.length;row++)
        // {
        //     for(int col=0;col<image[0].length;col++)
        //     {

        //     }
        // }
        int equalColor=image[sr][sc];//1
        image[sr][sc]=color;//2
        vis[sr][sc]=1;
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(sr,sc));
        while(!q.isEmpty())
        {
            int first=q.peek().f;//0
            int second=q.peek().s;//1
            q.remove();
            for(int delrow=-1;delrow<=1;delrow++)
            {
                for(int delcol=-1;delcol<=1;delcol++)
                {
                    int rows=first+delrow;
                    int cols=second+delcol;
                    if(rows>=0 && cols>=0 && rows<image.length && cols<image[0].length && vis[rows][cols]==0 && image[rows][cols]==equalColor)
                    {
                        if(Math.abs(delrow)+Math.abs(delcol)==1)
                        {
                            q.add(new Pair(rows,cols));
                            vis[rows][cols]=1;
                            image[rows][cols]=color;
                        }
                    }
                }
            }
        }
        return image;
    }
}