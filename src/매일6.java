import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 매일6 {
    static final int FIRST_VALUE = 9999;
    static final int LAST_VALUE = -1;
    public static void main(String[] args) {
        int a[][] = {{2,4}, {1,5}, {7,9}};
        int b[][] = {{3,6}, {1,3}, {2,4}};
        List<Integer[]> l = solution(a);
        List<Integer[]> l2 = solution(b);
        for(Integer[] result : l){
            System.out.print(Arrays.toString(result)+" ");
        }
        System.out.println();
        for(Integer[] result : l2){
            System.out.print(Arrays.toString(result)+" ");
        }
    }

    static List<Integer[]> solution(int[][] input){
        int first = FIRST_VALUE;
        int last = LAST_VALUE;

        List<Integer[]> list = new ArrayList<Integer[]>();
        for(int i = 0 ; i<input.length; i++){

            int[] arr = input[i];

            if(arr[0] > last && i != 0){
                list.add(new Integer[]{first,last});
                first = FIRST_VALUE;
                last = LAST_VALUE;
            }

            if(arr[0] < first){
                first = arr[0];
            }

            if(arr[1] > last){
                last = arr[1];
            }

            if(i == input.length-1){
                list.add(new Integer[]{first,last});
            }


        }

        return list;
    }
}
