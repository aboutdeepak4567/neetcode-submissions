class Solution {
    public int subsetXORSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
        for(int num : nums){
            int size = res.size();
            for(int i = 0;i<size;i++){
                List<Integer> subSet = new ArrayList<>(res.get(i));
                subSet.add(num);
                res.add(subSet);
            }





        }
        int sum = 0;
        for(List<Integer> list : res){
            int xor = 0;
            for(int num : list){
                xor ^= num; 

            }
            sum +=xor;
            
        }
        return sum;


        
    }
}