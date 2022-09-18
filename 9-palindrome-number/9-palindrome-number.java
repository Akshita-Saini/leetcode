class Solution {
    public boolean isPalindrome(int x) {
        String digitsString = String.valueOf(x);
        int n = digitsString.length();
        char digits[] = new char[n];
        for(int i=0;i<n;i++){
            digits[i] = digitsString.charAt(i);   
        }
        for(int i=0;i<n/2;i++){
            if(digits[i]!=digits[n-i-1]) return false;
        }
        return true;
    }
}