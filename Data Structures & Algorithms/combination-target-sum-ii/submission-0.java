class Solution {
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        Arrays.sort(nums);

        List<List<Integer>> res = new ArrayList<>();
        Queue<Pair> queue = new LinkedList<>();

        queue.offer(new Pair(new ArrayList<>(), 0, 0));

        while (!queue.isEmpty()) {
            Pair curr = queue.poll();

            if (curr.sum == target) {
                res.add(curr.list);
                continue;
            }

            for (int i = curr.index; i < nums.length; i++) {

                // skip duplicates
                if (i > curr.index && nums[i] == nums[i - 1]) continue;

                if (curr.sum + nums[i] > target) break;

                List<Integer> newList = new ArrayList<>(curr.list);
                newList.add(nums[i]);

                // move forward (no reuse)
                queue.offer(new Pair(newList, curr.sum + nums[i], i + 1));
            }
        }

        return res;
    }

    private class Pair {
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