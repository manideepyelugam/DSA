public class duplicateNumber {
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,2,3,3};
        int n = arr.length;
        int writeindex = 1;
       for(int i = 1; i <= n-1; i++){
          if(arr[i] != arr[i-1]){
                arr[writeindex] = arr[i];
                writeindex++;
          }
        }

        for(int i = 0; i < writeindex; i++){
            System.out.print(arr[i] + " ");
        }

    
    }
}
