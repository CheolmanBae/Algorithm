package Baekjoon;


import java.util.*;
import java.io.*;
import java.math.*;

public class pro3009 {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int x1,x2,x3,x4 = 0;
        int y1,y2,y3,y4 = 0;
        int[] x_cnt = new int[1001];
        int[] y_cnt = new int[1001];

        x1 = in.nextInt();
        x_cnt[x1] +=1;
        y1 = in.nextInt();
        y_cnt[y1] +=1;

        x2 = in.nextInt();
        x_cnt[x2] +=1;
        y2 = in.nextInt();
        y_cnt[y2] +=1;


        x3 = in.nextInt();
        x_cnt[x3] +=1;
        y3 = in.nextInt();
        y_cnt[y3] +=1;
        

        if(x_cnt[x1] == 1){
            x4 = x1;
        }else if(x_cnt[x2] == 1){
            x4 = x2;
        }else if(x_cnt[x3] == 1){
            x4 = x3;
        }

        if(y_cnt[y1] == 1){
            y4 = y1;
        }else if(y_cnt[y2] == 1){
            y4 = y2;
        }else if(y_cnt[y3] == 1){
            y4 = y3;
        }
        
        System.out.printf("%d %d", x4, y4);
    }
}
