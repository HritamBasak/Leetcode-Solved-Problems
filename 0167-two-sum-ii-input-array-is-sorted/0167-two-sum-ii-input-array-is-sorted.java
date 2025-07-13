class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // List<Integer> list = new ArrayList<>();
        // for (int i : numbers) {
        //     list.add(i);
        // }
        // Set<Integer> set = new LinkedHashSet<>(); 
        // //1 2 3 4 4 
        // //target: 8
        // for (int i = 0; i < numbers.length - 1; i++) {
        //     int diff = target - numbers[i];

        //     // Check for distinct elements forming the sum
        //     if (list.contains(diff) && numbers[i] != diff) {
        //         set.add(i + 1); 
        //         set.add(list.indexOf(diff) + 1);
        //         break; 
        //     }
        //     if (numbers[i] == numbers[i + 1] && numbers[i] * 2 == target) {
        //         set.add(i + 1);
        //         set.add(i + 2);
        //         break;
        //     }
        // }
        // int[] a = new int[2];
        // int j = 0;
        // for (int i : set) {
        //     a[j] = i;
        //     j++;
        // }
        // return a;

        int arr[]=new int[2];
        int left=0;
        int right=numbers.length-1;
        while(left<right)
        {
            int sum=numbers[left]+numbers[right];
            if(sum==target)
            {
                arr[0]=left+1;
                arr[1]=right+1;
                break;
            }
            if(sum>target)
            {
                right--;
            }
            else
            left++;
        }
        return arr;
    }
}
