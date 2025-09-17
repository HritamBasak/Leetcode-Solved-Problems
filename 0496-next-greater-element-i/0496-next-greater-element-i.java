class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int a[]=new int[nums1.length];
        for(int i=0;i<nums1.length;i++)
        {
            a[i]=-1;
        }
        List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();

        for(int i:nums1)
        list1.add(i);//4,1,2

        for(int i:nums2)
        list2.add(i);//1,3,4,2

        for(int i=0;i<nums1.length;i++)//4,1,2
        {
            int num=nums1[i];//4
                int index=list2.indexOf(num);//1
                for(int j=index;j<list2.size()-1;j++)
                {
                    if(list2.get(index)<list2.get(j+1))
                    {
                    a[list1.indexOf(num)]=list2.get(j+1);
                    break;
                    }
                }
        }
        return a;
    }
}