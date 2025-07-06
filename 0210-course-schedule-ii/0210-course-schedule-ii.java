class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        Queue<Integer> q=new LinkedList<>();
        List<List<Integer>> list=new ArrayList<>();
        int topo[]=new int[numCourses];
        for(int i=0;i<numCourses;i++)
        {
            list.add(new ArrayList<>());
        }
        for(int i=0;i<prerequisites.length;i++)
        {
            list.get(prerequisites[i][1]).add(prerequisites[i][0]);
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
            topo[inc++]=node;
            for(int adj:list.get(node))
            {
                inDegree[adj]--;
                if(inDegree[adj]==0)
                {
                    q.add(adj);
                }
            }
        }
        int temp=0;
        if(inc==numCourses)
        {
        for(int i=0;i<topo.length;i++)
        {
            temp=topo[i];
            topo[i]=topo[topo.length-i-1];
            topo[topo.length-i-1]=temp;
        }
        return topo;
        }
        return new int[0];
    }
}