class Solution{
public int lengthOfLastWord(String s) {
    int length = 0;
    int i = s.length() - 1;

    // Step 1: Skip all spaces at the very end
    while (i >= 0 && s.charAt(i) == ' ') {
        i--;
    }

    // Step 2: Count the letters until you hit the next space
    while ( i>=0 && s.charAt(i) != ' ') {
        length++;
        i--;
    }

    return length;
}}