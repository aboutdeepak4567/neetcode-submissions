// import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        
        // Initial queue: start with empty combination and target
        queue.offer(new Node(new ArrayList<>(), 0, 0));

        while (!queue.isEmpty()) {
            Node node = queue.poll();

            if (node.sum == target) {
                res.add(new ArrayList<>(node.combination));
                continue;
            }

            for (int i = node.start; i < candidates.length; i++) {
                int candidate = candidates[i];
                if (node.sum + candidate <= target) {
                    List<Integer> newComb = new ArrayList<>(node.combination);
                    newComb.add(candidate);
                    queue.offer(new Node(newComb, i, node.sum + candidate));
                }
            }
        }

        return res;
    }

    static class Node {
        List<Integer> combination;
        int start;  // start index to allow same element reuse
        int sum;

        Node(List<Integer> combination, int start, int sum) {
            this.combination = combination;
            this.start = start;
            this.sum = sum;
        }
    }
}