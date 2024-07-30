class Solution {
    public int[] sortArrayByParity(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> list1=new ArrayList<>();
        for(int i:nums)
        {
            if(i%2==0)
            list.add(i);
            else
            list1.add(i);
        }
        list.addAll(list1);//2,4,3,1
        int arr[]=new int[nums.length];
        for(int i=0;i<list.size();i++)
        {
            arr[i]=list.get(i);
        }
        return arr;
    }
}