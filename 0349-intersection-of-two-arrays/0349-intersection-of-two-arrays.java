class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1=new HashSet<>();
        for(int i:nums1)
        {
            set1.add(i);
        }
        Set<Integer> set2=new HashSet<>();
        for(int i:nums2)
        {
            set2.add(i);
        }
        set1.retainAll(set2);
        ArrayList<Integer> list=new ArrayList<>(set1);
        int arr[]=new int[list.size()];
        for(int i=0;i<list.size();i++)
        {
            arr[i]=list.get(i);
        }
        return arr;
    }
}