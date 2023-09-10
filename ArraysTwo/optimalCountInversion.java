public class Solution {
    public static int conquer(int arr[], int low, int mid, int high) {
        int merged[] = new int[high - low + 1];
        int idx1 = low;
        int idx2 = mid + 1;
        int x = 0;
        int count = 0;

        while (idx1 <= mid && idx2 <= high) {
            if (arr[idx1] <= arr[idx2]) {
                merged[x++] = arr[idx1++];
            } else {
                merged[x++] = arr[idx2++];
                count += (mid - idx1 + 1); // Corrected the inversion count here
            }
        }

        while (idx1 <= mid)
            merged[x++] = arr[idx1++];

        while (idx2 <= high)
            merged[x++] = arr[idx2++];

        for (int i = 0, j = low; i < merged.length; i++, j++)
            arr[j] = merged[i];

        return count;
    }

    public static int divide(int arr[], int low, int high) {
        int count = 0;
        if (low < high) {
            int mid = (low + high) / 2;
            count += divide(arr, low, mid);
            count += divide(arr, mid + 1, high);
            count += conquer(arr, low, mid, high);
        }
        return count;
    }

    public static int numberOfInversions(int[] a, int n) {
        return divide(a, 0, n - 1);
    }
}
