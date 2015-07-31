Given a binary tree, return the _zigzag level order_ traversal of its nodes' values. (ie, from left to right, then right to left for the next level and alternate between).

For example:  
 Given binary tree `{3,9,20,#,#,15,7}`,

    3
       / \
      9 20
        / \
       15 7

return its zigzag level order traversal as:

    [
      [3],
      [20,9],
      [15,7]
    ]

confused what `"{1,#,2,3}"` means? > read more on how binary tree is serialized on OJ.

  
  
**OJ's Binary Tree Serialization:**

The serialization of a binary tree follows a level order traversal, where '#' signifies a path terminator where no node exists below.

Here's an example:

    1
      / \
     2 3
        /
       4
        \
         5

 The above binary tree is serialized as `"{1,2,3,#,#,4,#,#,5}"`.  

Show Tags
 [Tree](/tag/tree/) [Breadth-first Search](/tag/breadth-first-search/) [Stack](/tag/stack/)
