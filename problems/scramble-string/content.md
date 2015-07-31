Given a string _s1_, we may represent it as a binary tree by partitioning it to two non-empty substrings recursively.

Below is one possible representation of _s1_ = `"great"`:

    great
       / \
      gr eat
     / \ / \
    g r e at
               / \
              a t

To scramble the string, we may choose any non-leaf node and swap its two children.

For example, if we choose the node `"gr"` and swap its two children, it produces a scrambled string `"rgeat"`.

    rgeat
       / \
      rg eat
     / \ / \
    r g e at
               / \
              a t

We say that `"rgeat"` is a scrambled string of `"great"`.

Similarly, if we continue to swap the children of nodes `"eat"` and `"at"`, it produces a scrambled string `"rgtae"`.

    rgtae
       / \
      rg tae
     / \ / \
    r g ta e
           / \
          t a

We say that `"rgtae"` is a scrambled string of `"great"`.

Given two strings _s1_ and _s2_ of the same length, determine if _s2_ is a scrambled string of _s1_.

Show Tags
 [Dynamic Programming](/tag/dynamic-programming/) [String](/tag/string/)
