public class reverseArray {

    public static int[] normalReverse(int[] arr){

        int start = 0;
        int end = arr.length-1;
        int temp;

        while (start <= end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        return arr;

    }

    public static int[] newArrayReverse(int[] arr){
        int newArray[] = new int[arr.length];

        for(int i = arr.length; i > 0; i--){
            newArray[arr.length-i] = arr[i-1];
        }

        return newArray;

    }
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,6,7};
        
        // normalReverse(arr);
        arr = newArrayReverse(arr);
      

        for(int i = 0;i < arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
