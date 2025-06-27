public class duplicateInArray {

    public static void BruteForce(int arr[]) {

        for (int i = 0; i < arr.length; i++) {

            int numb = arr[i];

            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] == numb){
                   
                    System.out.println(arr[j]);
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        int n [] = {3,1,3,4,2};

        BruteForce(n);
    }
}
