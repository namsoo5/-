import java.util.Arrays;

public class 매일190630 {
    public static void main(String[] args) {
        solution1(new int[]{-1,3,-1,5,4}, 2);
        solution1(new int[]{2,4,-2,-3,8}, 1);
        solution1(new int[]{-5,-3,1}, 3);
    }

    //내장함수 = 듀얼퀵정렬(일정이상의 크기시 다른정렬함)
    static void solution(int[] input, int n){
        Arrays.sort(input);
        System.out.println(input[input.length-n]);
    }

    //직접구현 함수
    static void solution1(int[] input, int n){

        int result = quickSort(input, 0, input.length-1, n-1);
        System.out.println(result);
    }

    static int quickSort(int[] arr, int first, int last, int n){

        if ( first <= last ){

            int pivot = partition(arr, first, last);
            if(pivot == n){
                return arr[n];
            }
            if(pivot < n){ //오른쪽만 정렬
                return quickSort(arr, pivot+1, last , n);
            }
            return quickSort(arr, first, pivot-1, n);
        }

        return -1;

    }

    static int partition(int[] arr, int first, int last){

        int pivot = first;
        for(int i=first; i<last; i++){
            if(arr[i] > arr[last]){
                swap(arr, i, pivot);
                pivot++;
            }
        }
        swap(arr, pivot, last);
        return pivot;

    }

    static void swap(int[] a, int x, int y){
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }
}
