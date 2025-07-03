class Solution {
    public void dfs(int i,List<List<Integer>> adjLst,int vis[])
    {
        vis[i]=1;
        for(Integer it:adjLst.get(i))
        {
            if(vis[it]==0)
            dfs(it,adjLst,vis);
        }
    }
    public int findCircleNum(int[][] isConnected) {
        if(isConnected.length==0)
        return 0;

        List<List<Integer>> adjLst=new ArrayList<>();
        int v=isConnected.length;
        for(int i=0;i<v;i++)
        {
            adjLst.add(new ArrayList<>());
        }
        for(int i=0;i<v;i++)
        {
            for(int j=0;j<v;j++)
            {
                if(isConnected[i][j]==1 && i!=j)
                {
                    adjLst.get(i).add(j);
                    // adjLst.get(j).add(i);
                }
            }
        }
        for(int i=0;i<v;i++)
        {
            System.out.println(adjLst.get(i)+" ");
        }
        //adjLst:[[1],[0],[]]
        int vis[]=new int[v];
        int c=0;
        for(int i=0;i<v;i++)
        {
            if(vis[i]==0)
            {
                c++;
                dfs(i,adjLst,vis);
            }
        }
        return c;
    }
}