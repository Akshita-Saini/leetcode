class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        String digitsString = String.valueOf(x);
        int n = digitsString.length();
        for(int i=0;i<n;i++){
            if(digitsString.charAt(i)!=digitsString.charAt(n-1-i)) return false;  
        }
        return true;
    }
}