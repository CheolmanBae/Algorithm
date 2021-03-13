package Baekjoon;

import java.util.*;
import java.io.*;
import java.math.*;



public class pro4948{
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> nlist = new ArrayList<>();

        String line = null;
        while((line = br.readLine()) != null){
            if(line.equals("0")){
                break;
            }
            else{
                nlist.add(Integer.parseInt(line));
            }
        }
        double max = 123456;
        max *=2;
        int sqrt = (int)Math.sqrt(max) + 1;
        int[] map = new int[123456*2+1];
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
            System.out.print(sum(map,i));
            c++;
            if(c != nlist.size()){
                System.out.print("\n");
            }
        }
        return;
    }
    private static int sum(int [] map2, int n){
        int cnt = 0;
        for (int i = n + 1 ; i<=2*n ; i++){   // n보다 크거나 2n보다 작거나 같은 개수
            if(map2[i] == 1 || map2[i] == 0){
                cnt +=1;
            }
        }
        return cnt;
    }
    
}
