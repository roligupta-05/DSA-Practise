public class ArrayTraversal {
    public static void main(String[] args) {
        int[] arr = {12, 45, 7, 23, 56};

        System.out.println("--- Traversing using a standard for loop ---");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Index " + i + ": " + arr[i]);
        }

        System.out.println("\n--- Traversing using a for-each loop ---");
        for (int val : arr) {
            System.out.println("Value: " + val);
        }
    }
}