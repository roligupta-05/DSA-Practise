
import java.util.Arrays;

public class InsertElement {
    public static void main(String[] args) {
        int[] arr = {13, 29, 35, 49, 57};
        int position = 2;
        int value = 25;

        int[] result = new int[arr.length + 1];

        System.arraycopy(arr, 0, result, 0, position);

        result[position] = value;

        System.arraycopy(arr, position, result, position + 1, arr.length - position);

        System.out.println(Arrays.toString(result));
    }
}
