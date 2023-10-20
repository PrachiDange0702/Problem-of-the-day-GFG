 Problem of the Day - Form a number divisible by 3 using array digits.

Link of the Problem - https://practice.geeksforgeeks.org/problems/form-a-number-divisible-by-3-using-array-digits0717/1

Question - You will be given an array arr of integers of length N. You can construct an integer from two integers by treating the integers as strings, and then concatenating them. For example, 19 and 4 can be used to construct 194 and 419.

The task is to find whether it’s possible to construct an integer using all the digits of these numbers such that it would be divisible by 3.
If it is possible then print 1 and if not print 0.

Example 1:

Input: N = 3
arr = {40, 50, 90}
Output: 1
Explanation: One such number is 405090.
Example 2:

Input: N = 2
arr = {1, 4}
Output: 0
Explanation: The numbers we can form 
are 14 and 41. But neither of them are 
divisible by 3.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ N, arr[i] ≤ 105
