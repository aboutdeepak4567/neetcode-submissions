class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> string1 = new HashMap<>();
        Map<Character,Integer> string2 = new HashMap<>();
        for(char ch : s.toCharArray()){
            string1.put(ch,string1.getOrDefault(ch,0)+1);
        }
         for(char ch : t.toCharArray()){
            string2.put(ch,string2.getOrDefault(ch,0)+1);
        }
        return string1.equals(string2);


    }
}
