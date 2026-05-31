package _1_D_Array;
public class _1_ReversalArray {
    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 4, 5, 6 };
        int n = array.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = array[i];
            array[i] = array[n - i - 1];
            array[n - i - 1] = temp;
        }

        System.out.println("Reversal of array");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
