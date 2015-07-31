# Leetcode Algorithms Shell

## Prerequisite

* Install Ruby
* `gem install bundle`
* `bundle config build.nokogiri --use-system-libraries`
* `bundle install`

## Fetch Problem List

```
$ ruby fetch.rb -l
Fetching problem list...
Saving page to problems.html...
Fetched 225 problems
Saving list to problems.yml...
Saving list to problems.md...
    Writing Delete Node in a Linked List
    Writing Maximum Depth of Binary Tree
    Writing Single Number
    Writing Two Sum II - Input array is sorted
    Writing Same Tree
    ...
```

## Fetch Problems

```
$ ruby fetch.rb -p
```

## List Problems

```
$ ruby problem.rb -l java
Done  Id    Title                                                           Acceptance  Difficulty
      237   Delete Node in a Linked List                                    45.8%       Easy
      104   Maximum Depth of Binary Tree                                    45.1%       Easy
      136   Single Number                                                   45.0%       Medium
N     167   Two Sum II - Input array is sorted                              43.5%       Medium
      100   Same Tree                                                       41.5%       Easy
      122   Best Time to Buy and Sell Stock II                              38.4%       Medium
      235   Lowest Common Ancestor of a Binary Search Tree                  38.1%       Easy
      191   Number of 1 Bits                                                37.7%       Easy
      171   Excel Sheet Column Number                                       36.6%       Easy
      ...
```

## Read Problem

```
$ ruby problem.rb -p problems/two-sum
Given an array of integers, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.

You may assume that each input would have exactly one solution.

Input: numbers={2, 7, 11, 15}, target=9
Output: index1=1, index2=2

Show Tags
 Array Hash Table
```

## Generate Source Code

```
$ ruby code.rb -l java problems/two-sum
public class Solution {
    public int[] twoSum(int[] numbers, int target) {

    }
}
Writing to problems/two-sum/java/Solution.java
---------------------------------------------------------------------------
// public class Solution {
//     public int[] twoSum(int[] numbers, int target) {
//
//     }
// }
import java.util.*;
public class Test extends TestCase<T>{
    public int runTestCase(int casenum) {
        switch(casenum) {
            case 0: {
                return verifyCase(casenum, ANS, new Solution().twoSum());
            }
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        TestRunner.run(new Test(), -1);
    }
}
Writing to problems/two-sum/java/Test.java
```

## Compile

    $ ruby runner.rb -l java -c problems/two-sum

## Test

```
$ ruby runner.rb -l java -t problems/two-sum
Example 0... PASSED
All 1 tests passed!
```
