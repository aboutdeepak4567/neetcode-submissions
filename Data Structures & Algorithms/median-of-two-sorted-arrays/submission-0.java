class Solution {
    public double findMedianSortedArrays(int[] num1, int[] num2) {
        // int[] num = new int[num1.length+num2.length];
        List<Integer> list = new ArrayList<>();
        int i = 0,j = 0;
        while(i < num1.length && j < num2.length){
            if(num1[i] <= num2[j]){
                list.add(num1[i]);
                i++;
            }else{
                list.add(num2[j]);
                j++;
            }
            

        }
        while(i < num1.length){
                list.add(num1[i]);
                i++;
            }
             while(j < num2.length){
                list.add(num2[j]);
                j++;
            }
            int n = list.size();
            if(n % 2 == 1){
                return list.get(n/2);
            }else{
                return (list.get(n/2 - 1) + list.get(n/2)) /  2.0;
            }
        
    }
}
