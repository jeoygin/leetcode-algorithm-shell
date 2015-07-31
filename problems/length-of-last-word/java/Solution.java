public class Solution {
    public int lengthOfLastWord(String s) {
        int len = 0;
        boolean newWord = false;
        for (int i = 0; i < s.length(); i++) {
        	if (s.charAt(i) == ' ') {
        		newWord = true;
        	} else {
        		len = !newWord ? len + 1 : 1;
        		newWord = false;
        	}
        }
        return len;
    }
}
