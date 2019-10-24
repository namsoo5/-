public class 매일3 {
    public static void main(String[] args) {
        solution(1);
        System.out.println("**********");
        solution(2);
        System.out.println("**********");
        solution(3);
    }
    static void solution(int n){

        Combination(n,1, 0, "(");

        return;
    }

    static void Combination(int n, int open, int close, String before){

        if(open > n){
            return;
        }
        if(close > open){
            return;
        }
        if(open == close && close == n){
            System.out.println(before);
        }

        Combination(n, open + 1, close , before+"(");
        Combination(n, open , close + 1, before+")");

    }



    static void Combination1(int n, int open, int close, String before) {
        if(before.length() == n*2){
            System.out.println(before);
            return;
        }
        if(open < n) {
            Combination1(n, open + 1, close, before + "(");
        }

        if(close < open) {
            Combination1(n, open, close + 1, before + ")");
        }
    }

}
