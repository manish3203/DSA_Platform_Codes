/*

	Longest Common prefix in a Array
	Company: VMWare, Microsoft, Google
	Platform: leetcode-14

	Description:
	Write a function to find the longest common prefix string amongst an array of strings.
	If there is no common prefix, return an empty string "".

	Example 1:
	Input: strs = ["flower","flow","flight"]
	Output: "fl"

	Example 2:
	Input: strs = ["dog", "racecar", "car"]
	Output: ""
	Explanation: There is no common prefix among the input strings.

	Constraints:
	1 <= strs.length <= 200
	0 <= strs[i].length <= 200
	strs[i] consists of only lowercase English letters.

*/

class Solution {
    public String longestCommonPrefix(String[] strs) {

        int min = Integer.MAX_VALUE;
        String minString = "";

        for(String st : strs) {

            if(st.length() < min) {

                min = st.length();
                minString = st;
            }
        }

        String str = "";
        for(int i=0; i<minString.length(); i++) {
            char ch = ' ';
            for(int j=0; j<strs.length; j++) {

                if(minString.charAt(i) != strs[j].charAt(i)) {

                    return str;
                }
                ch = strs[j].charAt(i);
            }
            str = str+ch;
        }
        return str;
    }
}
