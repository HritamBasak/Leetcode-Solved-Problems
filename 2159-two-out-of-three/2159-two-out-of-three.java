class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Set<Integer> set=new HashSet<>();
        Set<Integer> set1=new HashSet<>();
        Set<Integer> set2=new HashSet<>();
        Set<Integer> res=new HashSet<>();
        for(int i:nums1)
        {
            set.add(i);
        }
        for(int i:nums2)
        {
            set1.add(i);
        }
        for(int i:nums3)
        {
            set2.add(i);
        }
        // List<Integer> list=new ArrayList<>(set);
        // List<Integer> list1=new ArrayList<>(set1);
        // List<Integer> list2=new ArrayList<>(set2);

        for(int i:set)
        {
            if(set1.contains(i) || set2.contains(i))
            res.add(i);
        }
        for(int i:set1)
        {
            if(set.contains(i) || set2.contains(i))
            res.add(i);
        }
        for(int i:set2)
        {
            if(set1.contains(i) || set.contains(i))
            res.add(i);
        }
        List<Integer> list=new ArrayList<>(res);
        return list;
    }
}