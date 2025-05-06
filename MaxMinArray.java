public class MaxMinArray {
    static int max(int[] arr) {
        int maxx = arr[0]; // setting max variable so that we can compare it with other values of array
        for (int i = 0; i < arr.length; i++) {
            if (maxx < arr[i]) {
                maxx = arr[i];
            }
        }
        return maxx;

    }

    static int min(int[] arr) {
        int minn = arr[0]; 
        for (int i = 0; i < arr.length; i++) {
            if (minn > arr[i]) {
                minn = arr[i];
            }

        }
        return minn;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 0, 4, 6 };
        int maxx = max(arr);
        System.out.println("Maximum element in array is " + maxx);
        int minn = min(arr);
        System.out.println("Minimum element in array is " + minn);
    }
}