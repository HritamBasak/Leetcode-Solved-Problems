class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        // int topo[]=new int[numCourses];
        int c=0;
        Queue<Integer> q=new LinkedList<>();
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<numCourses;i++)
        {
            list.add(new ArrayList<>());
        }
        for(int i=0;i<prerequisites.length;i++)
        {
            list.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }
        int inDegree[]=new int[numCourses];
        for(int i=0;i<list.size();i++)
        {
            for(int j=0;j<list.get(i).size();j++)
            {
                inDegree[list.get(i).get(j)]++;
            }
        }
        for(int i=0;i<inDegree.length;i++)
        {
            if(inDegree[i]==0)
            q.add(i);
        }
        int inc=0;
        while(!q.isEmpty())
        {
            int node=q.poll();
            c++;
            for(int adj:list.get(node))
            {
                inDegree[adj]--;
                if(inDegree[adj]==0)
                {
                    q.add(adj);
                }
            }
        }
        System.out.println(c);
        if(numCourses==c)
        return true;
        else 
        return false;
    }
}