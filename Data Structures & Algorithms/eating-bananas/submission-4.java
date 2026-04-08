class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxm = 0;
        for (int pile : piles) {
            maxm = Math.max(maxm, pile);
        }

        int l = 1, r = maxm;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            int hours = 0;
            for (int pile : piles) {
                // ceil(pile / mid)
                hours += (pile + mid - 1) / mid;
            }

            if (hours <= h) {
                // valid speed → try smaller
                r = mid - 1;
            } else {
                // too slow → increase speed
                l = mid + 1;
            }
        }

        return l; // minimum valid speed
    }
}