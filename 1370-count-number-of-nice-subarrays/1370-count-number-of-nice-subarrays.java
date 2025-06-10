class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int c=0;
        int odd=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2!=0)
            odd++;

            c+=map.getOrDefault(odd-k,0);

            map.put(odd,map.getOrDefault(odd,0)+1);
        }
        return c;
    }
}