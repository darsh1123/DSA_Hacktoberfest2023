// Merge sort
public class Merge_sort {
    public static void conquer(int arr[], int si, int mid, int ei) {
        int merge[] = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= ei) {
            if (arr[i] <= arr[j]) {
                merge[k++] = arr[i++];
            } else {
                merge[k++] = arr[j++];
            }
        }
        while (i <= mid) {
            merge[k++] = arr[i++];
        }
        while (j <= ei) {
            merge[k++] = arr[j++];
        }
        for (int a = 0, b = si; a < merge.length; a++, b++) {
            arr[b] = merge[a];
        }
    }

    public static void devide(int arr[], int si, int ei) {

        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        devide(arr, si, mid);
        devide(arr, mid + 1, ei);
        conquer(arr, si, mid, ei);
    }

    public static void main(String args[]) {
        int arr[] = { 6, 3, 9, 5, 2, 8 };
        int n = arr.length;
        devide(arr, 0, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }
}
