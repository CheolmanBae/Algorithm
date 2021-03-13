package Baekjoon;

import java.util.*;
import java.io.*;



public class pro2869 {
    public static void main(String[] args) throws IOException{
        int A, B, V;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());
        

        int day = (V - B) / (A - B);
        if((V - B) % (A - B) != 0){
            day++;
        }

        System.out.print(day);
    }
    
}
