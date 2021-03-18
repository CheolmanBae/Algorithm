package Baekjoon;

import java.util.*;
import java.io.*;
import java.math.*;

public class pro10870 {
    public static void main(String[] args) throws IOException{
    
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        System.out.print(solution(t+1));
        return ;
    }
    
    private static int solution(int n){
        if(n == 1){
            return 0;
        }else if(n == 2 || n == 3){
            return 1;
        }
        else{
            return solution(n-1) + solution(n-2);
        }
    }

}
