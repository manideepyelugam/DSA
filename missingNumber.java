public class missingNumber {
    
    public static void main(String[] args) {
        int arr[] = {1,2,5,6,9,30};
        

        for (int i = arr[0]; i <= arr[arr.length-1]; i++) {
        
          boolean flaged = false;

          for (int j = 0; j < arr.length; j++) {

            if(i == arr[j]){
                flaged = true;
                break;
            }

          }
          
          if(!flaged){
                System.out.println(i);
            }
           
           
        }
     }
}
