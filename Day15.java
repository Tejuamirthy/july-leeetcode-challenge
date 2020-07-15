// Given an input string, reverse the string word by word.

// Input: "the sky is blue"
// Output: "blue is sky the"

// Input: "  hello world!  "
// Output: "world! hello"

// Input: "a good   example"
// Output: "example good a"


class Solution {
    public String reverseWords(String s) {
        String temp = "  ";
        int n = s.length();
        s = s.trim();
        String[] arr = s.split(" ");
        temp = "";
        for(int i = arr.length-1; i >= 0; i--) {
            if("".equals(arr[i])) {
                continue;
            }
            temp += arr[i];
            if(i != 0) {
                temp += " ";
            }
        }
        return temp;
    }
}
