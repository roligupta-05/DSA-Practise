
public class CountOccurrences {
    public static void main(String[] args) {
        int[] arr = {18, 26, 19, 35, 18, 41, 26};
        int key = 18;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                count++;
            }
        }

        System.out.println("Occurrences = " + count);
    }
}
