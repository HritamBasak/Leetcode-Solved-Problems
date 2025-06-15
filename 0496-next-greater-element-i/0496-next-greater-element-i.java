class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // int arr[]=new int[nums1.length];
        // for(int i=0;i<nums1.length;i++)
        // {
        //     arr[i]=0;
        // }
        // ArrayList<Integer> list=new ArrayList<>();
        // for(int i:nums1)
        // {
        //     list.add(i);
        // }
        // ArrayList<Integer> list1=new ArrayList<>();
        // for(int i:nums2)
        // {
        //     list1.add(i);
        // }
        // for(int i=0;i<list.size();i++)
        // {
        //     int num=list.get(i);//1
        //     int index=list1.indexOf(num);//0
        //     int temp=index;//0
        //     while(temp<list1.size()-1)
        //     {
        //         if(list1.get(temp+1)>=list1.get(index))
        //         {
        //             arr[i]=list1.get(temp+1);
        //             break;
        //         }
        //         temp++;
        //     }
        //     if(arr[i]==0)
        //     arr[i]=-1;
        // }
        // return arr;
        int res[]=new int[nums1.length];
        int n=nums2.length;
        List<Integer> list=new ArrayList<>();
        Stack<Integer> st=new Stack<>();
        for(int i:nums1)
        {
            list.add(i);
        }
        //list:4 1 2
        for(int i=n-1;i>=0;i--)
        {
            if(list.contains(nums2[i]))
            {
                while(!st.isEmpty() && nums2[i]>=nums2[st.peek()])
                {
                    st.pop();
                }
                if(!st.isEmpty())
                {
                    res[list.indexOf(nums2[i])]=nums2[st.peek()];
                }
                else
                {
                    res[list.indexOf(nums2[i])]=-1;
                }
            }
            st.push(i);
        }
        return res;
    }
}