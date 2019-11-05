import java.util.Arrays;

public class 매일12 {
    public static void main(String[] args) {
        solution(new int[]{1, 2, 3, 4, 5});
    }

    static void solution(int[] input) {
        int[] front = new int[input.length];
        int[] back = new int[input.length];
        int[] result = new int[input.length];

        int start = 1;
        for (int i = 0; i < input.length; i++) {

            front[i] = start;
            start *= input[i];

        }

        start = 1;
        for (int i = input.length - 1; i >= 0; i--) {
            back[i] = start;
            start *= input[i];
        }

        for (int i = 0; i < input.length; i++) {
//            System.out.println(front[i]+", "+back[i]);
            result[i] = front[i] * back[i];

        }

        System.out.println(Arrays.toString(result));
    }
}
