package Baekjoon;

import java.util.*;
import java.io.*;
import java.math.*;

public class pro1929 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int m,n;

        ArrayList<Integer> output = new ArrayList<>();


        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());

        int max = 1000000;

        int sqrt = (int)Math.sqrt(max);
        int[] map = new int[1000000+1];
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
        for(int i = m ; i<=n; i++){
            if(map[i] == 1 || map[i] == 0){
                output.add(i);
            }
        }

        for(int k = 0; k < output.size(); k++){
            System.out.print(output.get(k));
            if(k!=output.size()-1){
                System.out.print("\n");
            }
        }

        return;
    }
    
}
