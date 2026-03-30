class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String st : strs){
            char[] charArray = st.toCharArray();
            Arrays.sort(charArray);
            String sortedS = new String(charArray);
            map.putIfAbsent(sortedS,new ArrayList<>());
            map.get(sortedS).add(st);



            
        }
        return new ArrayList<>(map.values());

        
    }
}
