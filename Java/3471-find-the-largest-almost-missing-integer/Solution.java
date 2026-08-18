class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;

        // Case 1: The whole array is the only subarray.
        if (k == n) {
            int max = nums[0];

            for (int num : nums) {
                max = Math.max(max, num);
            }

            return max;
        }

        // Case 2: Every individual element is a subarray.
        if (k == 1) {
            int answer = -1;

            for (int i = 0; i < n; i++) {
                int count = 0;

                for (int j = 0; j < n; j++) {
                    if (nums[i] == nums[j]) {
                        count++;
                    }
                }

                if (count == 1) {
                    answer = Math.max(answer, nums[i]);
                }
            }

            return answer;
        }

        // Case 3: 1 < k < n
        int answer = -1;

        int first = nums[0];
        int last = nums[n - 1];

        if (appearsOnce(nums, first)) {
            answer = Math.max(answer, first);
        }

        if (appearsOnce(nums, last)) {
            answer = Math.max(answer, last);
        }

        return answer;
    }

    private boolean appearsOnce(int[] nums, int target) {
        int count = 0;

        for (int num : nums) {
            if (num == target) {
                count++;
            }
        }

        return count == 1;
    }
}
