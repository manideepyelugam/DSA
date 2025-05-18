import java.util.*;

public class leftRotateByNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int rotate = sc.nextInt();

        rotate = rotate % arr.length;


        int temp[] = new int[rotate];

        for (int i = 0; i < rotate; i++) {
            temp[i] = arr[i];
        }

        for (int i = rotate; i < arr.length; i++) {
            arr[i - rotate] = arr[i];
        }

      for(int i = arr.length-rotate; i < arr.length;i++){
          arr[i] = temp[i - (arr.length - rotate) ];
      }

      for(int i =0;i<arr.length;i++){
        System.out.print(arr[i]);
      }

        
    }
}
