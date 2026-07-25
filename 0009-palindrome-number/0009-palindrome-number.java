class Solution {
    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i) != str.charAt(str.length()-1-i)) {
                return false;
            }
        }
        return true;
    }
}