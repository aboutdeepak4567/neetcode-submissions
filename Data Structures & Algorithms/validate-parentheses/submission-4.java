class Solution {
    public boolean isValid(String s) {
        StringBuilder sb = new StringBuilder(s);
        boolean found = true;
        while(found){
            found = false;
            for(int i = 0;i<sb.length() - 1;i++){
                char first = sb.charAt(i);
                char second = sb.charAt(i+1);
                if((first == '(' && second == ')') ||
                (first == '[' && second == ']') ||
                (first == '{' && second == '}')){
                    sb.delete(i,i+2);
                    found = true;
                    break;
                }
            }
        }
        return sb.length() == 0;
        
    }
}
