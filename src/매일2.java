
//public static void main(String[] args) {
//        System.out.println(solution(12));
//        }
//static int solution(int n){
//
//
//        return 0;
//        }


public class 매일2 {
    public static void main(String[] args) {
        System.out.println(solution(12));
    }

    static int solution(int n) {

        int index = 3;
        int sum = 0;

        while(true){  //피보나치 순회

            int value = fibonacci(index);

            if(value % 2 == 0){   //피보나치결과가 짝수인경우 더하기
                sum += value;
            }

            if( sum+value > n ){   //피보나치결과값과 현재값더했을때 조건넘을시 끝
                break;
            }

            index++;

        }

        return  sum;

    }

    static int fibonacci(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }

        return fibonacci(n-1) + fibonacci(n-2);

    }


    static int solution1(int n){
        int sum = 0;
        int x = 0;
        int y = 1;

        while(x < n){
            if(x % 2 == 0){
                sum += x;
            }

            int z = x + y;
            x = y;
            y = z;

        }
        return sum;
    }
}
