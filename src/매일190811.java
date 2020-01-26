public class 매일190811 {
    public static void main(String[] args) {
        int[] a = {1, 2, 4, 0, 3};
        int[] b = {1, 4, 5, 0, 3, 2};
        int[] c = {1, 2, 2, 0};

        System.out.println(solution(a));
        System.out.println(solution(b));
        System.out.println(solution(c));
    }

    static boolean solution(int[] input) {

        int index = 0;

        for (int i = 0; i < input.length; i++) {

            System.out.println(index);
            if (i != 0 && 0 == index) {
                return false;
            }

            index = input[index];
        }

        if (index == 0) {
            return true;
        }

        return false;
    }

    static boolean solutionOrigin(int[] input) {

        int nextIndex = input[0];

        for (int i = 0; i < input.length; i++) {

            System.out.println(nextIndex);
            if (i==input.length-1 && nextIndex != 0) {
                return false;
            }

            nextIndex = input[nextIndex];
        }


        return true;
    }
}
