package Baekjoon;

import java.util.Scanner;

public class pro1712{
    public static void main(String [] args){
        
        Scanner in = new Scanner(System.in);

        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        
        if( C-B < 0){
            System.out.printf("-1");
            return;
        } 

        int tmp = (int)(A/(C-B));

        System.out.printf("%d",tmp+1);
        return;
   
    }
}