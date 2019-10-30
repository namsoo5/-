import java.util.Arrays;

public class 매일9 {
    public static void main(String[] args) {
        solution(new int[]{0, 5, 0, 3, -1});
        solution(new int[]{3, 0, 3});
    }

    static void solution(int[] input) {
        int index = 0;

        for (int i = 0; i < input.length; i++) {
            if (input[i] == 0) {
                continue;
            } else if(input[i] != 0) {
                int temp = input[i];
                input[i] = 0;
                input[index++] = temp;
            }
        }

        System.out.println(Arrays.toString(input));
    }
}
