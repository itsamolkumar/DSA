public class BinarySearch {
    public static void main(String args[]) {
        int arr[] = {2, 4, 6, 8, 10, 12, 14};
        int key = 8;
        int index = search(arr, key);

        if (index == -1) {
            System.out.println(key + " not found");
        } else {
            System.out.println(key + " found at index " + index);
        }
    }

    public static int search(int[] arr, int key) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == key) return mid;
            if (arr[mid] < key) start = mid + 1;
            else end = mid - 1;
        }
        return -1;
    }
}
