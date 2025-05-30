public class consecutiveOne {
    public static void main(String[] args) {
        int arr[] = {1,0,1,1,0,1,1,1,0,0,1,1,1,1,0,0};

        int count = 0;
        int max_count = 0;


        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 1){
                count++;
                if(count > max_count){
                max_count++;

                }
            }else{
                count=0;
            }
        }

        System.out.println(max_count);
    }
}
