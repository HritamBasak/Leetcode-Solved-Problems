class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> set=new HashSet<>();
        List<Integer> cur=new ArrayList<>();
        findSubset(0,nums,cur,set);
        return new ArrayList<>(set);
    }
    public void findSubset(int index,int nums[],List<Integer> cur,Set<List<Integer>> set)
    {
        if(index==nums.length)
        {
            set.add(new ArrayList<>(cur));
            return;
        }
        findSubset(index+1,nums,cur,set);
        cur.add(nums[index]);
        findSubset(index+1,nums,cur,set);
        cur.remove(cur.size()-1);
    }
}