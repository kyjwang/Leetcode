class Solution {
    public int gcdOfOddEvenSums(int n) {
        int[] even = new int[n];

        for (int i = 0; i < n; i++) {
            even[i] = (i + 1) * 2;
        }

        int sumeven = 0;

        for (int i = 0; i < n; i++) {
            sumeven += even[i];
        }

        int[] odd = new int[n];

        for (int i = 0; i < n; i++) {
            odd[i] = ((i + 1) * 2) - 1;
        }

        int sumodd = 0;

        for (int i = 0; i < n; i++) {
            sumodd += odd[i];
        }

        int a = sumeven;
        int b = sumodd;

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}
