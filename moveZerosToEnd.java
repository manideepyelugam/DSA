public class moveZerosToEnd {

    public static void optimal(int arr[]){
        
         int   j   = 0;  

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[j++] = arr[i];
            }
        }

        while (j < arr.length) {
            arr[j++] = 0;
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }


    }
    public static void main(String[] args) {
        int arr[] = {1,0,2,3,4,0,0,4,5,6,3,0,2};

        int temp[] = new int[arr.length];

        int count = 0;
        int j = 0;
        for(int i = 0; i < arr.length;i++){
            if(arr[i] != 0){
                temp[j] = arr[i];
                j++;
            }else{
                count++;
            }
        }

       for(int i = j; i < count;i++){
           temp[i] = 0;
       }

       for(int i = 0; i < temp.length;i++){
        System.out.print(temp[i]);
       }

       optimal(arr);

    }
}


