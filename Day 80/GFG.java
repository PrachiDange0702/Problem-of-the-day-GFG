Problem of the Day - Intersection of two sorted Linked lists

Link - https://www.geeksforgeeks.org/problems/intersection-of-two-sorted-linked-lists/1

Question - Given two linked lists sorted in increasing order, create a new linked list representing the intersection of the two linked lists. The new linked list should be made with without changing the original lists.

Note: The elements of the linked list are not necessarily distinct.

Example 1:

Input:
LinkedList1 = 1->2->3->4->6
LinkedList2 = 2->4->6->8
Output: 2 4 6
Explanation: For the given two
linked list, 2, 4 and 6 are the elements
in the intersection.
Example 2:

Input:
LinkedList1 = 10->20->40->50
LinkedList2 = 15->40
Output: 40

Expected Time Complexity : O(n+m)
Expected Auxilliary Space : O(n+m)
Note: n, m are the size of the respective linked lists.

Constraints:
1 <= size of linked lists <= 5000
1 <= Data in linked list nodes <= 104
