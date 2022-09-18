class Solution {
    public boolean isPalindrome(int x) {
        String digitsString = String.valueOf(x);
        char digits[] = new char[digitsString.length()];
        for(int i=0;i<digitsString.length();i++){
            digits[i] = digitsString.charAt(i);   
        }
        for(int i=0;i<digits.length/2;i++){
            if(digits[i]!=digits[digits.length-i-1]) return false;
        }
        return true;
    }
}