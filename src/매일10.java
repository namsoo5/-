public class 매일10 {
    public static void main(String[] args) {
        solution("aabcbcbc");
        solution("aaaaaaaa");
        solution("abbbcedd");
        solution("abcdabcd");

    }
    static void solution(String input){

        char[] c = input.toCharArray();

        String subString = "";
        int first = 0;
        int last = 0;
        int max = 0;

        for(int i =0; i<c.length; i++){
            if(subString.contains(""+c[i])){
                if(max < last-first){
                    max = last-first;
                }
                //중복되는순간 다시 substring시작
                subString = ""+c[i];
                first = i;
                last = i+1;

            }else {

                subString += "" + c[i];
                last++;
            }
//            System.out.println(subString+", "+last);
        }

        System.out.println(max);
    }
}
