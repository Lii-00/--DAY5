/*
题目：#217
给你一个整数数组 nums 。如果任一值在数组中出现至少两次 ，返回 true ；如果数组中每个元素互不相同，返回 false 。

*/

class Solution {
    public boolean containsDuplicate(int[] nums) {
        //方法一：先排序后进行相邻数据比较
        Arrays.sort(nums);          //对nums[]排序，调用该Arrays对象时，需要导包java.util.Arrays
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] == nums[i+1])return true;
        }
        return false;
        //方法二：哈希表
        /*
        Set<Integer> set = new HashSet<Integer>();
        for (int x : nums) {
            if (!set.add(x)) {
                return true;
            }
        }
        return false;
         */
    }
    
}