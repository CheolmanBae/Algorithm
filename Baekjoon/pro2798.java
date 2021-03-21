package Baekjoon;

import java.util.*;
import java.io.*;
import java.math.*;

public class pro2798 {
    public static void main(String[] args) throws IOException{

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int error_range = 999999999;
        int sum = 0;

        int []map = new int[n];

        for(int i = 0; i<n;i++){
            map[i] = in.nextInt();
        }

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int k=j+1; k<n; k++){


                    if( Math.abs( m - (map[i]+map[j]+map[k]) ) <  Math.abs(error_range) && m >= map[i]+map[j]+map[k] ){
                        error_range = Math.abs(m - (map[i]+map[j]+map[k]));
                        sum = map[i]+map[j]+map[k];
                    }

                    if(error_range == 0){
                        System.out.printf("%d",sum);
                        return;
                    }

                
                }   
            }
        }


        System.out.printf("%d",sum);

        return;
    }
}
