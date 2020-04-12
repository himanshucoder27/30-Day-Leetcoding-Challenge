/**
Problem Statement:
Given a non-empty array of integers, every element appears twice except for one. Find that single one.

Example1:
Input: [2,2,1]
Output: 1

Example2:
Input: [4,1,2,1,2]
Output: 4

Approach:
This problem can be solved by use of Bitwise XOR operator.
This operator is binary operator, denoted by ‘^’. It returns bit by bit XOR of input values, i.e, if corresponding bits are different, it gives 1, else it gives 0.

Time Complexity: O(n)
Space Complexity: O(1)

In short XOR of a number with itself is equal to zero(0) and XOR of number with zero is equal to the number itself.
Hence taking an example:
Input[2,2,1]

Soln: 
2 ^ 2 ^ 1, this can be seen as
(2 ^ 2) ^ 1
0 ^ 1
1
Hence 1 is the integer which occurs once in the array.
*/
class Solution {
    public int singleNumber(int[] nums) {
        if(nums== null || nums.length == 0) return 0;
        int res = nums[0];
        for(int i=1; i<nums.length; i++){
            res = res ^ nums[i];
        }
        return res;
        
    }
}