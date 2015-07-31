Given an array _nums_, there is a sliding window of size _k_ which is moving from the very left of the array to the very right. You can only see the _k_ numbers in the window. Each time the sliding window moves right by one position.

For example,  
 Given _nums_ = `[1,3,-1,-3,5,3,6,7]`, and _k_ = 3.

    Window position Max
    --------------- -----
    [1 3 -1] -3 5 3 6 7 3
     1 [3 -1 -3] 5 3 6 7 3
     1 3 [-1 -3 5] 3 6 7 5
     1 3 -1 [-3 5 3] 6 7 5
     1 3 -1 -3 [5 3 6] 7 6
     1 3 -1 -3 5 [3 6 7] 7

Therefore, return the max sliding window as `[3,3,5,5,6,7]`.

**Note:**  
 You may assume _k_ is always valid, ie: 1 ≤ k ≤ input array's size for non-empty array.

**Follow up:**  
 Could you solve it in linear time?

1. How about using a data structure such as deque (double-ended queue)?
2. The queue size need not be the same as the window’s size.
3. Remove redundant elements and the queue should store only elements that need to be considered.

Show Tags
 [Heap](/tag/heap/)

Show Similar Problems
 [(H) Minimum Window Substring](/problems/minimum-window-substring/) [(E) Min Stack](/problems/min-stack/) [(H) Longest Substring with At Most Two Distinct Characters](/problems/longest-substring-with-at-most-two-distinct-characters/)

