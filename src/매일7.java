public class 매일7 {
    public static void main(String[] args) {
        System.out.println(solution("abc 123 apple"));
    }

    static String solution(String input) {
        String result = "";

        String arr[] = input.split(" ");

        for (String s : arr) {
            result += reverse(s)+" ";
        }

        return result;
    }

    static String reverse(String s) {

        char rs[] = s.toCharArray();
        String reverseString = "";
        for (int i = rs.length - 1; i >= 0; i--) {
            reverseString += rs[i];
        }

        return reverseString;
    }
}
