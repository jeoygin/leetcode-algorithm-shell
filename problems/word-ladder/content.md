Given two words (_start_ and _end_), and a dictionary, find the length of shortest transformation sequence from _start_ to _end_, such that:

1. Only one letter can be changed at a time
2. Each intermediate word must exist in the dictionary

For example,

Given:  
_start_ = `"hit"`  
_end_ = `"cog"`  
_dict_ = `["hot","dot","dog","lot","log"]`

As one shortest transformation is `"hit" -> "hot" -> "dot" -> "dog" -> "cog"`,  
 return its length `5`.

**Note:**

- Return 0 if there is no such transformation sequence.
- All words have the same length.
- All words contain only lowercase alphabetic characters.

Show Tags
 [Breadth-first Search](/tag/breadth-first-search/)
