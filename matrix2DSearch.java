public class matrix2DSearch {
    public static void main(String[] args) {
        int n = 4;
        int m = 3;
        int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(arr[i][j] == 9){
                    System.out.println(i +" "+j);
                }
            }
        }
    }
}
