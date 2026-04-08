class Solution {
    public boolean isHappy(int n) {
        ArrayList<Integer> seen = new ArrayList<>();
        return isHappyHelper(n, seen);
    }
    
    private boolean isHappyHelper(int n, ArrayList<Integer> seen) {
        // Base case: reached 1
        if (n == 1) {
            return true;
        }
        
        // Base case: found a cycle
        if (seen.contains(n)) {
            return false;
        }
        
        // Add current number to seen list
        seen.add(n);
        
        // Calculate sum of squares of digits
        int sumOfSquares = 0;
        while (n > 0) {
            int digit = n % 10;
            sumOfSquares += digit * digit;
            n /= 10;
        }
        
        // Recursive call with the new sum
        return isHappyHelper(sumOfSquares, seen);
    }
}