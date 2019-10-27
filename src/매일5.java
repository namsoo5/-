import java.util.*;

public class 매일5 {
    public static void main(String[] args) {
        int a[] = {2,5,6,1,10};
        int b[] = {3,6,4,9,12};
//        System.out.println(solution(a, 8));
//        System.out.println(solution(b, 16));
//        System.out.println(Arrays.toString(solution1(a, 8)));
//        System.out.println(Arrays.toString(solution1(b, 16)));
    }

    static List solution(int[] arr, int target){
        List<Integer> list = new ArrayList<Integer>();

        HashSet<Integer> set = new HashSet<Integer>();
        for(int n : arr){
             set.add(n);
        }

        for(int i=0; i<arr.length; i++){
            int result = target - arr[i];
            if(set.contains(result)){
                list.add(i);
            }
        }


        return list;
    }


    static int[] solution1(int[] arr, int target){

        HashMap<Integer, Integer> set = new HashMap();

        for(int i=0; i<arr.length; i++){
            int result = target - arr[i];
            if(set.containsKey(result)){
                int sum[] = {i, set.get(result)};
                return sum;
            }
            set.put(arr[i], i);
        }

        int err[] = new int[0];
        return err;
    }
}
