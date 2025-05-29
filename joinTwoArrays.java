public class joinTwoArrays {

    public static int[] twoLoops(int[] arr1, int[] arr2){
        int tempArr[] = new int[arr1.length+arr2.length];

        for(int i = 0; i < arr1.length;i++){
            tempArr[i] = arr1[i];
        }


        for(int i = 0; i < arr2.length;i++){
            tempArr[arr1.length+i] = arr2[i];
        }


        return tempArr;

    }


    public static int[] oneLoop(int arr1[],int arr2[]){
        int tempArr[] = new int[arr1.length+arr2.length];

        for(int i = 0;i < tempArr.length;i++){
            tempArr[i] = (i < arr1.length) ? arr1[i] : arr2[i - arr1.length];
        }


        return tempArr;
    }
    
    public static void main(String[] args) {
        
       int arr1[] = {1,2,3,4,2,3};
       int arr2[] = {1,4,3,2,4,5,3};


    //    int arr[] = oneLoop(arr1,arr2);
          int arr[] = twoLoops(arr1,arr2);


       for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]);
       }


    
    }
}
