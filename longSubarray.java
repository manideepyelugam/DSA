public class longSubarray {
    public static void main(String[] args) {
        int k[] = {-2,1,-3,4,-1,2,1,-5,4};

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

        System.out.println(maxSum +" "+ len);
    }
}
