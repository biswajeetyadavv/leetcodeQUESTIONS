public class Q1 {
   Q1. https://leetcode.com/problems/divide-array-into-arrays-with-max-difference/?envType=daily-question&envId=2024-02-01
    //        Q1. https:https//leetcode.com/problems/divide-array-into-arrays-with-max-difference/description/?envType=daily-question&envId=2024-02-01
//        You are given an integer array nums of size n and a positive integer k.
//
//                Divide the array into one or more arrays of size 3 satisfying the following conditions:
//
//        Each element of nums should be in exactly one array.
//        The difference between any two elements in one array is less than or equal to k.
//        Return a 2D array containing all the arrays. If it is impossible to satisfy the conditions, return an empty array.And if there are
//        multiple answers, return any of them.

 public int[][] divideArray(int[] nums, int k) {
        int arr[][] = new int[nums.length/3][3];
        int line = 0;
//        Arrays.sort(nums);
        for(int i = 0;i<nums.length;i+=3){
            int first = nums[i];
            int sec = nums[i+1];
            int third = nums[i+2];
            if(third-first <= k){
                arr[line][0] = first;
                arr[line][1] = sec;
                arr[line][2] = third;
                line++;

            }
            else{
                return new int[0][0];
            }

        }
        return arr;


    }
}
