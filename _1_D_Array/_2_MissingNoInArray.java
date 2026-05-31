package _1_D_Array;
// Time Complexity = O(n)
// Space Complexity = O(1)  --> no used any Other New array, only used variable 
// problem is OverFlow ( arraySize is very big )

public class _2_MissingNoInArray {
    public static void main(String[] args) {
        int array[] = { 1, 2, 4, 5, 6, 7 };
        int n = array.length;

        // sum of natural numbers (O(1))
        int sum_natural_no = ((n + 1) * (n + 2)) / 2;
        int sum = 0;

        // this will find sum of elements in array (O(1))
        for (int i = 0; i < n; i++) {
            sum = sum + array[i];
        }

        // afinding missings no - O(1)
        int missing_number = 0;
        missing_number = sum_natural_no - sum;
        System.out.println("Missing number is = " + missing_number);
    }
}
