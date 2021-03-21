package Baekjoon;

import java.util.*;
import java.io.*;
import java.math.*;

public class pro2447 {
 
    static char[][] map;

    public static void main(String[] args) throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        map = new char[N][N];

        print(0,0,N,false);
        
        for(int i = 0; i< N;i++){
            bw.write(map[i]);
            if(i != N-1){
                bw.write("\n");
            }
            
        }
        
        bw.flush();
        bw.close();

        return;

    }
    private static void print(int x, int y, int n, boolean blank){
        
        if(blank){
            for(int i = x; i < x+n; i++){
                for(int j = y; j < y+n; j++){
                    map[i][j] = ' ';
                }
            }
            return;
        }

        if(n==1){
            map[x][y] = '*';
            return;
        }
        

        int size = n/3;
        int starcnt = 0;

        for(int i = x; i < x + n; i += size){
            for(int j = y; j < y + n; j += size){
                starcnt++;
                if(starcnt == 5){
                    print(i,j,size,true);
                }else{
                    print(i,j,size,false);
                }
            }
        }
         

    }


}

