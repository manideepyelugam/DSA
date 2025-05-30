public class numberThatAppearsOnce {
    public static void main(String[] args) {
        int arr[] = {4,1,2,1,2,4,5};

        boolean found;

        for (int i = 0; i < arr.length; i++) {
            found = false;
            for (int j = 0; j < arr.length; j++) {
                if(i != j){
                    if(arr[i] == arr[j]){
                    found = true;
                    break;
                }
                }
                
            }
            if(found == false){
                System.out.println(arr[i]);
            }
        }
    }
}
