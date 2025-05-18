import java.util.*;

public class leftRotateByNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in array");
        int n = sc.nextInt();
        int arr[] = new int[n];
       

        System.out.println("Enter left rotate number");
        int d = sc.nextInt();

        int temp[] = new int[d];
        d = d % n;

        System.out.println("Enter array numbers");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < d;i++){
            temp[i] = arr[i];
        }

        for(int i = d;i < n; i++){
            arr[i - d] = arr[i];
        }


        for(int i = n-d ; i < n;i++){
            arr[i] = temp[i-(n-d)];
        }


        for(int i = 0; i < n;i++){
            System.out.print(arr[i]);
        }
       


        
    }
}