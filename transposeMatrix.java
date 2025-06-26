public class transposeMatrix {
    public static void main(String[] args) {
        int array[][] = {{1,2,3}
                        ,{4,5,6}
                        ,{7,8,9}};


        
        
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(i != j){

                   int temp = array[i][j];
                   array[i][j] = array[j][i];
                   array[j][i] = temp;

                }
            }
        }


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }


}
