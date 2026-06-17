class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String st : strs){
            char[] arr = st.toCharArray();
            Arrays.sort(arr);
            String s = new String(arr);
            map.putIfAbsent(s,new ArrayList<>());
            map.get(s).add(st);
        }
        return new ArrayList<>(map.values());

        
    }
}
