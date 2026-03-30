class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();

        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(new ArrayList<>(), 0, 0));

        while (!queue.isEmpty()) {
            Pair curr = queue.poll();

            if (curr.sum == target) {
                res.add(curr.list);
                continue;
            }

            if (curr.sum > target) continue;

            for (int i = curr.index; i < nums.length; i++) {
                List<Integer> newList = new ArrayList<>(curr.list);
                newList.add(nums[i]);

                queue.offer(new Pair(newList, curr.sum + nums[i], i)); // reuse allowed
            }
        }

        return res;
    }

    class Pair {
        List<Integer> list;
        int sum;
        int index;

        Pair(List<Integer> list, int sum, int index) {
            this.list = list;
            this.sum = sum;
            this.index = index;
        }
    }
}