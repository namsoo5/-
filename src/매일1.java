public class 매일1 {
    public static void main(String[] args) {
        int[] a = {-1, 3, -1, 5};
        int[] b = {-5, -3, -1};
        int[] c = {2, 4, -2, -3, 8};
        System.out.println(solution(a));
        System.out.println(solution(b));
        System.out.println(solution(c));
    }

    static int solution(int[] input){

        int maxSum = -9999;
        int sum = 0;
        for( int n : input){

            sum += n;

            if( sum < n ){   //현재값이 지금까지의 합보다큰경우 리셋
                sum = n;
            }

            if( maxSum < sum ){
                maxSum = sum;
            }
        }

        return  maxSum;
    }
}
