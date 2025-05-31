public class hashingBasic {

    public static int hash(int number, int arr[]){

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == number){
                count++;
            }
        }

        return count;

    }
    public static void main(String[] args) {
        int arr[] = {1,2,4,3,2,1,2};

        for (int i = 0; i < arr.length; i++) {
          System.out.println(hash(arr[i], arr));  
        }
        
    }
}
