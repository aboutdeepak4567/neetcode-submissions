class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int minCapacity = 0;
        for(int weight : weights){
            minCapacity = Math.max(minCapacity,weight);
        }
        while(true){
            int cap = minCapacity;
            int ship = 1;
            for(int weight : weights){
                if(cap - weight <0){
                    ship++;
                    cap = minCapacity;
                }
                cap -= weight;
            }
            if(ship <= days){
                return minCapacity;
            }
            minCapacity++;

        }

        
    }
}