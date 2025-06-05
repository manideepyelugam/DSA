public class sortArray012 {

    public static int[] sort(int a[]){

        for (int i = 0; i < a.length-1; i++) {
            for(int j = i; j < a.length;j++){

            }
        }

        return a;
    }
    public static void main(String[] args) {
        int a[] = {2,0,2,1,1,0};

        int one = 0;

        int two = 0;

        int zero = 0;

        

        for(int i = 0; i < a.length;i++){
           if (a[i] == 0) zero++;
           else if(a[i] == 1) one++;
           else two++;
        }

        int index = 0;

        for (int i = 0; i < zero; i++) {
            a[index++] = 0;
        }

        for (int i = 0; i < one; i++) {
            a[index++] = 1;
        }

        for (int i = 0; i < two; i++) {
            a[index++] = 2;
        }


        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

       
    }
}