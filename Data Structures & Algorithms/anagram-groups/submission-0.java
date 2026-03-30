class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hm = new HashMap<>();
        for(String st : strs){
            char[] cr = st.toCharArray();
            Arrays.sort(cr);
            String str = new String(cr);
            if(hm.containsKey(str)){
                hm.get(str).add(st);
            }else{
                List<String> list = new ArrayList();
                list.add(st);
                hm.put(str,list);
            }
        }
        return new ArrayList<>(hm.values());

        
    }
}
