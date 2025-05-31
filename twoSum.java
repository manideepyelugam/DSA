public class twoSum {
    public static void main(String[] args) {
        int arr[] = {2,6,5,8,11};
        int k = 15;
        boolean found = false;
        int temp[] = new int[2];

        for (int i = 0; i < arr.length; i++) {


            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]+arr[j] == k){
                    found = true;
                    temp[0] = i;
                    temp[1] = j;
                }
            }

            
        }


            if(!found){
                temp[0] = -1;
                temp[1] = -1;
            }

        System.out.println(found);
        for (int i = 0; i < temp.length; i++) {
            System.out.println(temp[i]);
        }
    }
}
