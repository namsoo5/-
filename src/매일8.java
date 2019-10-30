import java.util.Arrays;

public class 매일8 {
    public static void main(String[] args) {

        int a[] = {10, 5, 4, 3, -1};
        int b[] = {3, 3, 3};
//        System.out.println(solution(a));
//        System.out.println(solution(b));

        solution1(a);
    }


    // 시간복잡도 n^2
    static String solution(int[] input){

        Arrays.sort(input);
        int index = input.length-1;
        int cur = input[index];
        int before = input[index-1];


        if(cur == before){
            return "Does not exist";
        }else{
            return ""+before;
        }

    }

    //시간복잡도 n
    static void solution1(int[] input){
        int cur = -9999, before = -9999;

        for(int i =0; i<input.length; i++){
            if(cur < input[i]){
                before = cur;
                cur = input[i];
            }else if( input[i] > before && input[i] != cur){
                before = input[i];
            }
        }

        if(before == -9999){
            System.out.println("Does not exist.");
        }else {
            System.out.println(before);
        }
    }
}
