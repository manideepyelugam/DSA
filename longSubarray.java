public class longSubarray {

    public static int KadanesAlgo(int[] array){
        int maxSum = 0;
        int currentSum = 0;

        for (int i = 0; i < array.length; i++) {
            currentSum += array[i];
            maxSum = Math.max(maxSum, currentSum);
            if(currentSum < 0){
                currentSum = 0;
            }

            
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int k[] = {-2,1,-3,4,-1,2,1,-5,4,9};

        int maxSum = 0;
        int len = 0;

        for (int i = 0; i < k.length; i++) {
            int sum = 0;


            for (int j = i; j < k.length; j++) {
                sum += k[j];

                if(sum > maxSum){
                    maxSum = sum;
                }
                
            }
        }

        System.out.println(maxSum);

         
        System.out.println("maxsum from kadanes algo"+" "+ KadanesAlgo(k));
    }
}
