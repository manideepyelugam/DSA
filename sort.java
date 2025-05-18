public class sort {
    public static void main(String[] args) {
        int[] arr = {1,4,3,4,5};
        int n = arr.length;

        for(int i = 0; i < n-1;i++){
            if(arr[i] > arr[i+1]){
                System.out.println("array not sorted");
                return;
            }
        }
        System.out.println("array sorted");
    }
}
