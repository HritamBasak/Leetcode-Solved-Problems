class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        combinations(0,res,list,target,candidates);
        return res;
    }
    public void combinations(int i,List<List<Integer>> res,List<Integer> list,int target,int a[])
    {
        if(i==a.length)
        {
            if(target==0)
            res.add(new ArrayList<>(list));

            return;
        }
        if(a[i]<=target)
        {
            list.add(a[i]);
            combinations(i,res,list,target-a[i],a);
            list.remove(list.size()-1);
        }
        combinations(i+1,res,list,target,a);
    }
}