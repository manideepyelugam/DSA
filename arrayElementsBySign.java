public class arrayElementsBySign {


    public static void better(int arr[]){

        int result[] = new int[arr.length];
        int pos = 0;
        int neg = 1;


        for (int i = 0; i < result.length; i++) {
            if(arr[i] < 0){
                result[neg] = arr[i];
                neg += 2;
            }else{
                result[pos] = arr[i];
                pos += 2;
            }
        }


        for (int i : result) {
            System.out.print(i + " ");
        }


    }



    public static void BruteForce(int arr[]) {
        
        int pos[] = new int [arr.length/2];
        int posCount = 0;
        int neg[] = new int [arr.length/2];
        int negCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 0){

                neg[negCount] = arr[i];
                negCount++;

            }else{

                pos[posCount] = arr[i];
                posCount++;

            }

        }

        posCount = 0;negCount = 0;


        for (int i = 0; i < arr.length; i++) {
            if(i % 2 == 0){
                arr[i] = pos[posCount];
                posCount++;
            }else{
                arr[i] = neg[negCount];
                negCount++;
            }
        }


        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
    public static void main(String[] args) {
        int arr[] = {1,2,-4,-5,3,1,-2,-3};
        // BruteForce(arr);
        better(arr);


    }
}
