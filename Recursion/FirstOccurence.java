public class FirstOccurence {
    public static void main(String[] args) {
        int[] arr = {8, 3, 6, 9, 5, 10, 2, 5, 3};
        occurence(arr, 0, 5);
    }

    public static void occurence(int[] arr, int i, int key) {
        if (i == arr.length) {
            System.out.println("not available");
            return;
        }

        if (arr[i] == key) {
            System.out.println("found at - " + i);
            return;
        }

        occurence(arr, i + 1, key);
    }
}
    