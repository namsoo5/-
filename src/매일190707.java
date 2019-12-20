import java.util.Arrays;

public class 매일190707 {
    public static void main(String[] args) {
        String[] s1 = {"apple", "apps", "ape"};
        String[] s2 = {"hawaii", "happy"};
        String[] s3 = {"dog", "dogs", "doge"};

        solution(s1);
        solution(s2);
        solution(s3);

        solution1(s1);
    }

    static void solution(String[] input) {

        StringBuilder pre = new StringBuilder();
        StringBuilder temp;

        pre.append(input[0]);
        int min = pre.length();

        for (int i = 1; i < input.length; i++) {

            temp = new StringBuilder();
            temp.append(input[i]);

            StringBuilder s = prefixCheck(pre, temp);
            if (s.length() < min) {
                pre = s;
                min = s.length();
            }
        }

        System.out.println(pre);
    }

    static StringBuilder prefixCheck(StringBuilder before, StringBuilder cur) {

        int len = before.length() < cur.length() ? before.length() : cur.length();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < len; i++) {

            if (before.charAt(i) == cur.charAt(i)) {
                sb.append(before.charAt(i));
            } else {
                break;
            }

        }
        return sb;
    }

    static int solution1(String[] input) {

        String first = input[0];

        for (int i = 0; i < first.length(); i++) {

            char element = first.charAt(i);

            for (int j = 1; j < input.length; j++) {

                if (input[i].length() == i || input[j].charAt(i) != element) {
                    System.out.println(i);
                    return i;
                }

            }

        }

        System.out.println(first.length());
        return first.length();

    }
}
