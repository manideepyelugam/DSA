public class longestSubarray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4,1,1,1,1,3};
        int k = 6;

        int len = 0;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == k) {
                    len = Math.max(len, j - i + 1);
                }
            }
        }

        System.out.println("Length of longest subarray with sum = " + k + " is: " + len);
    }
}
