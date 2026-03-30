class Solution {
    private boolean isPalindrome(String st){
        int l = 0,r = st.length() - 1;
        while(l<r){
            if(st.charAt(l) != st.charAt(r)){
                return false;
            }
            l++;r--;
        }
        return true;

    }
    public boolean validPalindrome(String s) {
        if(isPalindrome(s)){
            return true;
        }
        for(int i = 0;i<s.length();i++){
            String newS = s.substring(0,i) + s.substring(i+1);
            if(isPalindrome(newS)){
                return true;
            }
        }
        return false;

        
        
        
    }
}