class Solution {
    public void combinations(int i,int target,List<Integer> list,List<List<Integer>> ans,int a[])
    {
        if(i==a.length)
        {
            if(target==0)
            ans.add(new ArrayList<>(list));

            return;
        }
        if(a[i]<=target)
        {
            list.add(a[i]);
            combinations(i,target-a[i],list,ans,a);
            list.remove(list.size()-1);
        }
        combinations(i+1,target,list,ans,a);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> list=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        combinations(0,target,list,ans,candidates);
        return ans;
    }
}