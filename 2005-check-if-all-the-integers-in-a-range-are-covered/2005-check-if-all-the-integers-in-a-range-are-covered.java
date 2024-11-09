class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<ranges.length;i++)
        {
            for(int j=ranges[i][0];j<=ranges[i][1];j++)
            {
                int num=j;
                System.out.println(num);
                if(num>=left && num<=right && !list.contains(num))
                {
                    list.add(num);
                }
            }
        }
        return list.size()==((right-left)+1)?true:false;
    }
}