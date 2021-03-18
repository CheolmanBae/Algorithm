package Baekjoon;

import java.util.*;
import java.io.*;
import java.math.*;

public class pro10872 {
    public static void main(String[] args) throws IOException{
        int n;
        
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        if(n==1 || n == 0){
            System.out.print("1");
        }else{
            System.out.print(solution(n));
        }
        return;
    }
    private static long solution(int a){
        if(a==1 || a==0)
            return 1;
        else{
            return a * solution(a-1);
        }

    }
}
