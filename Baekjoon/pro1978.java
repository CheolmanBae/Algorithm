package Baekjoon;

import java.util.*;
import java.io.*;
import java.math.*;

public class pro1978 {
    public static void main(String[] args) throws IOException{

        Scanner sin = new Scanner(System.in);

        int cnt = sin.nextInt();

        int cas = 0;

        ArrayList<Integer> nlist = new ArrayList<>();

        for(int k=0; k<cnt; k++){
             cas = sin.nextInt();
             nlist.add(cas);
        }

        double max = 1000;
        int sqrt = (int)Math.sqrt(max) + 1;
        int[] map = new int[1000+1];
        map[0] = -1;
        map[1] = -1;
        int con;

        for (int i = 2; i <= sqrt ; i++){
            con = 1;
            for (int j = i; j <= max; j= i * con){
                if( map[j] != -1 && j / i == 1 && j % i == 0){
                    map[j] = 1;
                }else{
                    map[j] = -1;
                }
                con++;
            }
        }
        int c = 0;
        for (int i : nlist) {
            if(map[i]==1 || map[i] == 0)
            c++;
            
        }
        System.out.printf("%d",c);

        return;
    }
}
