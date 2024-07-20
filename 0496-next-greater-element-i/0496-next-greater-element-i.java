class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int arr[]=new int[nums1.length];
        for(int i=0;i<nums1.length;i++)
        {
            arr[i]=0;
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int i:nums1)
        {
            list.add(i);
        }
        ArrayList<Integer> list1=new ArrayList<>();
        for(int i:nums2)
        {
            list1.add(i);
        }
        for(int i=0;i<list.size();i++)
        {
            int num=list.get(i);//1
            int index=list1.indexOf(num);//0
            int temp=index;//0
            while(temp<list1.size()-1)
            {
                if(list1.get(temp+1)>=list1.get(index))
                {
                    arr[i]=list1.get(temp+1);
                    break;
                }
                temp++;
            }
            if(arr[i]==0)
            arr[i]=-1;
        }
        return arr;
    }
}