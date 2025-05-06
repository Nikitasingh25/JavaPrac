public class ArrayRevInPlace {
    static void rev(int[] arr) {
        for (int i = 0, j = arr.length - 1; i < j; i++, j--)

        {
            int temp;
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

        }
        System.out.println("Reversed elements are ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        rev(arr);

    }
}
