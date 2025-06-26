public class LeaderInArray {

    public static void optimal(int arr[]) {

        int maxLength = arr[arr.length-1];
        System.out.println(maxLength);

        for (int i = arr.length-2; i >= 0; i--) {
            if(arr[i] > maxLength){
                maxLength = arr[i];
                System.out.println(maxLength);
            }

            
        }
    }
    public static void main(String[] args) {
        int arr[] = {10,22,12,3,0,6};

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            boolean wht = false;

            for (int j = i; j < arr.length; j++) {
               if(arr[j] > num){
                 wht = true;
                 break;
               }

            }

            if(wht == false){
                System.out.println(arr[i]);
            }
            


        }


        optimal(arr);
    }
}
