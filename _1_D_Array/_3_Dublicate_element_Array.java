package _1_D_Array;
public class _3_Dublicate_element_Array {
    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 4, 4, 4, 5, 5, 5, 6 };
        int n = array.length;
        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {
                if (array[i] == array[j]) {
                    System.out.println("Found dublicate elemets are :  " +array[i]);
                }
            }
        }
    }
}
