class Solution {
    public String convertToTitle(int columnNumber) {
        String result = "";
        
        while (columnNumber > 0) {
            columnNumber--;  // Adjust for 1-indexed (no zero)
            result = (char)('A' + columnNumber % 26) + result;
            columnNumber /= 26;
        }
        
        return result;
    }
}