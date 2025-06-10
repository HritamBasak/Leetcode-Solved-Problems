class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);//
        int current[]=intervals[0];//[1,4]
        ArrayList<int[]> list=new ArrayList<>();
        int max=current[1];
        for(int i=1;i<intervals.length;i++)
        {
            if(current[1]>=intervals[i][0])
            {
                current[1]=Math.max(current[1],intervals[i][1]);//[1,5]
            }
            else
            {
                list.add(current);//[(1,6),]
                current=intervals[i];
            }
        }
        list.add(current);
        int a[][]=new int[list.size()][2];
        for(int i=0;i<list.size();i++)
        {
            a[i][0]=list.get(i)[0];
            a[i][1]=list.get(i)[1];
        }
        return a;
    }
}