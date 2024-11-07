class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<rectangles.length;i++)
        {
            int min=Integer.MAX_VALUE;
            for(int j=0;j<2;j++)
            {
                if(rectangles[i][j]<min)
                {
                    min=rectangles[i][j];
                }
            }
            list.add(min);
        }
        for(int i:list)
        {
            System.out.println(i);
        }
        TreeMap<Integer,Integer> map=new TreeMap<>();
        for(int i:list)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int max=0;
        for(int i:map.keySet())
        {
            max=map.get(i);
        }
        return max;
    }
}