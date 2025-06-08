public class subArraySum {
    public static void main(String[] args) {
        int array[] =  {3, 1, 2, 4};
        int k = 6;


        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = i; j < array.length; j++) {
                sum += array[j];

                 if (sum == k) {
                    System.out.print("Subarray: ");
                    for (int x = i; x <= j; x++) {
                        System.out.print(array[x] + " ");
                    }
                    System.out.println();
                }
            }
        }
    }
}
