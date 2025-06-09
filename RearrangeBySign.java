import java.util.*;

public class RearrangeBySign {
    public static int[] rearrange(int[] arr) {
        Queue<Integer> pos = new LinkedList<>();
        Queue<Integer> neg = new LinkedList<>();

        for (int num : arr) {
            if (num >= 0) pos.add(num);
            else neg.add(num);
        }

        int[] result = new int[arr.length];
        int i = 0;

        // Alternating placement
        while (!pos.isEmpty() && !neg.isEmpty()) {
            result[i++] = pos.poll();  // Positive first
            result[i++] = neg.poll();  // Then negative
        }

        return result;
    }

    // Main for testing
    public static void main(String[] args) {
        int[] arr = {1, 2, -4, -5};
        int[] result = rearrange(arr);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
