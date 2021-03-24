package Baekjoon;

import java.util.*;
import java.io.*;
import java.math.*;

public class pro7568 {
    public static void main(String[] args) throws IOException{

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        int[][] map = new int[2][N];
        int[] rank = new int[N];

        for(int i = 0; i < N; i++){
            map[0][i] = in.nextInt();
            map[1][i] = in.nextInt();
        }
        
        for(int i = 0; i < N; i++){
            rank[i] = 1;
            for(int j = 0; j<N; j++){
                if(map[0][i] < map[0][j] && map[1][i] < map[1][j]){    
                    rank[i]++;
                }
            }
        }

        for(int i=0 ; i<N; i++){
            System.out.printf("%d", rank[i]);
            if(i!=N-1){
                System.out.printf(" ");
            }
        }
        return;
    }

}
