public class MajorityElement {

    public static void main(String[] args) {
        int arr[] = {1,2,2,3,2,3,2,2};


        int half = arr.length/2;


        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    count++;
                }
            }

            if(count >= half){
                System.out.println(arr[i]);
                return;
            }
        }
    }
}