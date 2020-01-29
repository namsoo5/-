import java.util.Arrays;
//퀵정렬
public class 매일190814 {
    public static void main(String[] args) {
        int[] test1 = {3, 1, 5, 6};
        solution(test1);
    }

    static void solution(int[] input) {
        quickSort(input, 0, input.length - 1);
        System.out.println(Arrays.toString(input));
    }

    static void quickSort(int[] arr, int a, int b) {
        if (a >= b) {
            return;
        }

        int pivot = a;
        for (int i = 0; i < b; i++) {
            if (arr[i] < arr[b]) {
                swap(arr, i, pivot);
                pivot++;
            }
        }
        swap(arr, pivot, b);

        quickSort(arr, a, pivot - 1);
        quickSort(arr, pivot + 1, b);
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}
