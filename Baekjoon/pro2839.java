package Baekjoon;

import java.util.*;
import java.io.*;

public class pro2839 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), "\n");

        int n;

        n = Integer.parseInt(st.nextToken());

        int[] map = new int[5001];

        map[1] = -1;
        map[2] = -1;
        map[3] = 1;
        map[4] = -1;
        map[5] = 1;
        

        System.out.print(solution(n,map));
        
        return;
    }
    private static int solution(int n, int [] tmp){

        if(n == 3 || n == 5){   // 초기값 3 or 5인 경우 바로 리턴
            return tmp[n];
        }else if(n==4){         // 초기값 4인 경우 바로 리턴
            return tmp[n];
        }

        // dp로 값 6부터 저장하면서 n(5000)까지 계산한다.
        for(int i = 6; i <= n; i++){
            if(tmp[i-5] == -1 && tmp[i-3]== -1){   // 5 or 3의 배수가 아닌 경우 -1로 넣는다.
                tmp[i] = -1;
            }

            else{   //if(tmp[i-5] != -1 || tmp[i-3] != -1 ) 

                if(tmp[i-5] == -1 && tmp[i-3] != -1){
                    tmp[i] = tmp[i-3] + 1;

                }else if(tmp[i-5] != -1 && tmp[i-3] == -1){
                    tmp[i] = tmp[i-5] + 1;
                }
                else{
                    if( tmp[i-5] >= tmp[i-3]){
                        tmp[i] = tmp[i-3] +1;
                    }else{
                        tmp[i] = tmp[i-5] +1;
                    }
                }
            }
        }
        return tmp[n];
    }
}


