package deQuy;

/**
 * duyetmang
 */
public class duyetmang {

    public static void printElement(int arr[], int index) {
        if (index >= arr.length || index < 0)
            return;
        System.out.println(arr[index]);
        printElement(arr, index - 1);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 5, 6, 7, 87, 6 };
        int n = arr.length;
        printElement(arr, n);
    }

}