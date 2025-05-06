public class KthMaxMinInArray {
    static void max(int[] arr, int k) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + " : " + arr[i] + " ");
        }

        for (int i = 0; i < arr.length; i++) {
            if (i == k - 1) {
                System.out.println(k + "th max element is " + arr[i]);
                break;
            }
        }
    }

    static void min(int[] arr, int k) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + " : " + arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            if (i == k - 1) {
                System.out.println(k + "th Min element in array is " + arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 0, 9, 5 };
        // max(arr, 1);
        min(arr, 3);
    }

}
