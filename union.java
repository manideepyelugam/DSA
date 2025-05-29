public class union {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5,3,4,3,4};
        int arr2[] = {1,2,4,9,0,7};

        int arr3[] = new int[arr1.length+arr2.length];


        for(int i = 0;i < arr3.length;i++){
            arr3[i] = (i < arr1.length) ? arr1[i] : arr2[i-arr1.length];
        }

        int temp;


        for(int i = 0; i < arr3.length-1;i++){
            for(int j = 0; j < arr3.length-1-i;j++){
                if(arr3[j] > arr3[j+1]){
                    temp = arr3[j];
                    arr3[j] = arr3[j+1];
                    arr3[j+1] = temp;
                }
            }
        }



        int[] unique = new int[arr3.length];
        int j = 0;
        unique[j++] = arr3[0];

        for (int i = 1; i < arr3.length; i++) {
            if (arr3[i] != arr3[i - 1]) {
                unique[j++] = arr3[i];
            }
        }



        for (int i = 0;i < j;i++) {
            System.out.print(unique[i]);

        }

         
        
        
    }
}
