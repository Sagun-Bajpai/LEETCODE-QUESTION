class Solution {
    public int majorityElement(int[] arr) {
        int n = arr.length;
        int max = 0;
        int ans = arr[0];
        if (n == 1) {
            return arr[0];
        }

        for (int i = 0; i < n - 1; i++) {
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }

            }
            if (max < count) {

                max = count;
                ans = arr[i];
            }
            System.out.println(max);
        }
        if (max > n / 2) {
            return ans;
        }
        return 0;

    }
}