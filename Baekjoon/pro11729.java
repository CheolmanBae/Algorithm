package Baekjoon;

import java.util.*;
import java.io.*;
import java.math.*;

public class pro11729 {

    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        bw.write((int) (Math.pow(2, n) -1)+"\n");   // 하노이 탑 식 2에 n승 -1
        // n-1개를 2번으로 옴기고 n의 수를 3번으로 옴기고 n-1개를 2번에서 3으로 옴긴다.
        
        hanoi(n,1,2,3);

        bw.flush();
        bw.close();
        
        return;
    }
    //from : 출발지, by 임시장소, to 목적지
    public static void hanoi(int N, int from, int by, int to) throws IOException{
        if(N==1){
            bw.write(from + " " + to + "\n");
            return;
        }

        // 1번에서 n-1을 2번으로 옮긴다.
        hanoi(N-1, from, to ,by);

        // 1번에서 제일 큰 수를 3번으로 옴긴다.
        bw.write(from + " " + to + "\n");

        // 2번에서 n-1을 3번으로 옮긴다.
        hanoi(N-1, by, from, to);
    }


}
