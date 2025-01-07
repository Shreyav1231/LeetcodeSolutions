class Solution {
    public int lengthOfLastWord(String s) {
        String[] substrings = s.split("\\s+"); // regex expression for all whitespace characters
        return substrings[substrings.length - 1].length();
    }
}
