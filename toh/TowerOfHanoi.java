public class TowerOfHanoi {

    // Recursive function to solve Tower of Hanoi
    public static void solveHanoi(int n, char source, char destination, char auxiliary) {
        // Base case: If there's only one disk, move it from source to destination
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }

        // Step 1: Move n-1 disks from source to auxiliary
        solveHanoi(n - 1, source, auxiliary, destination);

        // Step 2: Move the nth disk from source to destination
        System.out.println("Move disk " + n + " from " + source + " to " + destination);

        // Step 3: Move n-1 disks from auxiliary to destination
        solveHanoi(n - 1, auxiliary, destination, source);
    }

    public static void main(String[] args) {
        int numberOfDisks = 3;  // Change this value to test with different numbers of disks
        System.out.println("Tower of Hanoi solution for " + numberOfDisks + " disks:");
        solveHanoi(numberOfDisks, 'A', 'C', 'B');  // A: Source, C: Destination, B: Auxiliary
    }
}
