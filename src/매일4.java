import java.util.ArrayList;
import java.util.List;

public class 매일4 {
    public static void main(String[] args) {
        System.out.println(solution(12345));
        System.out.println(solution(-101));
        System.out.println(solution(11111));
        System.out.println(solution(12421));
    }

    static boolean solution(int n){

        List<Integer> li = new ArrayList<Integer>();

        int temp = n;

        if(n<0 || (n%10 == 0 && n!=0)){  //0으로 시작하거나 -로끝나는 숫자는없음
            return false;
        }

        while(true){
//            System.out.println(temp);
            if(temp == 0){
                break;
            }

            int a = temp%10;
            li.add(a);  //숫자 배열로분리
            temp /= 10;

        }
//        System.out.println(li.toString());

        for(int i =0; i<li.size()/2; i++){  //비교
            if(li.get(i) != li.get(li.size()-i-1)){
                return false;
            }
        }

        return true;
    }
}
