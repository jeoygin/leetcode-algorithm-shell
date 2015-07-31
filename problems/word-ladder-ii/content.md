Given two words (_start_ and _end_), and a dictionary, find all shortest transformation sequence(s) from _start_ to _end_, such that:

1. Only one letter can be changed at a time
2. Each intermediate word must exist in the dictionary

For example,

Given:  
_start_ = `"hit"`  
_end_ = `"cog"`  
_dict_ = `["hot","dot","dog","lot","log"]`

Return

    [
        ["hit","hot","dot","dog","cog"],
        ["hit","hot","lot","log","cog"]
      ]

**Note:**

- All words have the same length.
- All words contain only lowercase alphabetic characters.

Show Tags
 [Array](/tag/array/) [Backtracking](/tag/backtracking/) [Breadth-first Search](/tag/breadth-first-search/) [String](/tag/string/)
