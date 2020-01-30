public class 매일190818 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 7, 10};
        int[] b = {-5, -3, 0, 1};
        int[] c = {1, 4, 5, 6, 8, 9};

        System.out.println(solution(a, 7));
        System.out.println(solution(b, 0));
        System.out.println(solution(c, 10));

    }

    static boolean solution(int[] input, int n) {

//        return partition(input, 0, input.length, n);
        return whilepartition(input, n);
    }

    static boolean partition(int[] input, int start, int end, int n) {
        int index = (start + end) / 2;

        if (input[index] == n) {
            return true;
        }

        if (start == end) {
            return false;
        }

        if (input[index] > n) {
            return partition(input, 0, index - 1, n);
        } else if (input[index] < n) {
            return partition(input, index + 1, input.length - 1, n);
        }

        return false;
    }

    static boolean whilepartition(int[] input, int n) {
        int start = 0;
        int end = input.length - 1;



        while (true) {
            int mid = (start + end) / 2;

            if (input[mid] == n) {
                return true;
            }

            if (start >= end) {
                return false;
            }

            if (input[mid] < n) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
    }


}
