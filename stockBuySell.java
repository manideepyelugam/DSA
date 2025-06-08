public class stockBuySell {

    public static int bruteForce(int array[]){
        int maxProfit = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if(array[j] - array[i] > maxProfit){
                    maxProfit = array[j] - array[i];

                }
            }
        }


        return maxProfit;

    }


    public static int optimal(int array[]){

        int maxProfit = 0;
        int count = array[0];


        for (int i = 0; i < array.length; i++) {
            if(count > array[i]){
                count = array[i];
            
            }

            if(maxProfit < array[i] - count){
                     maxProfit = array[i] - count;
            }
        }



        return maxProfit;


    }


    public static void main(String[] args) {
        int array[] = {7,1,5,3,6,4};

        System.out.println(bruteForce(array));
        System.out.println(optimal(array));


    

    }
}
