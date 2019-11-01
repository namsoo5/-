import java.util.HashMap;

public class 매일11 {
    public static void main(String[] args) {
        System.out.println(solution("EGG","FOO"));
        System.out.println(solution("ABBCD", "APPLE"));
        System.out.println(solution("AAB", "FOO"));
    }

    static boolean solution(String a, String b){

        HashMap<Character, Character> map = new HashMap<>();

        char[] ca = a.toCharArray();
        char[] cb = b.toCharArray();

        for(int i =0; i<ca.length; i++){

            if(map.containsKey(ca[i]) && map.get(ca[i]) != cb[i]) {
                return false;
            }else {
                map.put(ca[i], cb[i]);
            }
        }
        return true;
    }
}
