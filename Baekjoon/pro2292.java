package Baekjoon;

import java.util.*;

public class pro2292 {
    public static void main(String[] args){
        int X;
        Scanner in = new Scanner(System.in);
        X = in.nextInt();

        System.out.print(solution(X));

    }
    private static int solution(int n){
        int sum = 0;
        int cnt = 0;

        if(n == 1){
            return 1;
        }

        for(int i = 1; ; i++){
            sum = (3 * i * i) - (3 * i) + 1;
            cnt++;
            if(n <= sum){
                return cnt;
            }
        }
    }


}
