package Baekjoon;

import java.util.*;
import java.io.*;
import java.math.*;

public class pro2581{
    public static void main(String[] args) throws IOException{

        Scanner sin = new Scanner(System.in);

        int min_in = sin.nextInt();

        int max_in = sin.nextInt();

        ArrayList<Integer> nlist = new ArrayList<>();

        int max = 10000;

        int sqrt = (int)Math.sqrt(max);
        int[] map = new int[10000+1];
        map[0] = -1;
        map[1] = -1;
        int con;

        // 10000까지 소수인지 판별하기
        for (int i = 2; i <= sqrt ; i++){
            con = 1;
            for (int j = i; j <= max; j= i * con){
                if( map[j] != -1 && j / i == 1 && j % i == 0){
                    map[j] = 1;
                }else{
                    map[j] = -1;
                }
                con++;
            }
        }
        int sum = 0; // 소수의 합
        int tmp = 0; // 최소값 담을 곳
        int flag_1 = 0;

        for (int i = min_in; i <= max_in; i++) {
            if(map[i]==1 || map[i] == 0){
                sum += i;
                if(++flag_1 == 1){
                    tmp = i;
                }
            }

        }
        if(sum==0){
            System.out.print("-1");
        }
        else{
            System.out.printf("%d %d", sum, tmp);
        }

        return;
    }
}
