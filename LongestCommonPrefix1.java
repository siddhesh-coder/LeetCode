/*Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

 

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 

Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters.*/

import java.util.Arrays;

public class LongestCommonPrefix1{
    static String longestCommonPrefix(String[] strs) {
    StringBuilder result = new StringBuilder();
    Arrays.sort(strs);
    char[] first = strs[0].toCharArray();
    char[] last = strs[strs.length-1].toCharArray();

    for(int i=0;i<first.length;i++){
        if(first[i]!=last[i]){
            break;
        }
        result.append(first[i]);
    }
    return result.toString();
  }

    public static void main(String[] args) {
       String[] strs = {"flower","flow","flight"};
       String ans = longestCommonPrefix(strs);
        System.out.println(ans);
    }
}
