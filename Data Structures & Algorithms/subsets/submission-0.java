class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>());
        for(int j : nums){
            int size = list.size();
            for(int i = 0;i<size;i++){
                List<Integer> dummy = new ArrayList<>(list.get(i));
                dummy.add(j);
                list.add(dummy);


            }

        }
        return list;
        
    }
}
