
public class maximumSubarraySum {

    public static int[] bruteForce(int[] array) {


        int maxSum = 0;
        int k = 0;
        
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = i; j < array.length; j++) {
                sum += array[j];

            }

            if(sum > maxSum){
                maxSum = sum;
                k = i;
            }

        }

        int temp[] = new int[3];

        temp[0] = k;
        temp[1] = array.length - k+1;
        temp[2] = maxSum;

       

        return temp;
    }


    public static int[] kadanes(int[] array){

        int maxSum = 0;
        int currentSum = 0;
        int k = 0;


        for (int i = 0; i < array.length; i++) {
            currentSum += array[i];
           
            maxSum = Math.max(maxSum, currentSum);

            if(currentSum < 0){
                 k = i;

                currentSum = 0;
            }

        }

        int temp[] = new int[3];

        temp[0] = k+1;
        temp[1] = array.length - temp[0] + 2;
        temp[2] = maxSum;

        return temp;
    }



    public static void main(String[] args) {
        int array[] = {-2,1,-3,4,-1,2,1,-5,4,9};

        int tem[] = bruteForce(array);

        for (int i = tem[0]; i < tem[1]+1; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();

       System.out.println("maximum number is "+tem[2]);


       int temu[] = kadanes(array);

       for (int i = temu[0]; i < temu[1]; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();

       System.out.println("kadenes maximum number is "+temu[2]);
        
    }
}
