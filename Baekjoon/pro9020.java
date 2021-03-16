package Baekjoon;

import java.util.*;
import java.io.*;
import java.math.*;

public class pro9020 {
    public static void main(String[] args) throws IOException{

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        int max = 10000;

        int sqrt = (int)Math.sqrt(max);
        int[] map = new int[10000+1];
        map[0] = -1;
        map[1] = -1;
        int con;

        // 10000까지 소수인지 판별하기
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

        int[] input = new int[t];
        for(int k = 0; k < t; k++){
            input[k] = in.nextInt();
        }

        ArrayList<Integer> output = new ArrayList<>();

        

        for(int c = 0; c < t ; c++){
            output = solution(map,input[c]);
            for(int i = 0; i < output.size(); i++){
                System.out.print(output.get(i));
                if(i != output.size()-1){
                    System.out.print(" ");
                }
            }
            if(c != t-1){
                System.out.print("\n");
            }
        }
        

        return;

    }   
    private static ArrayList<Integer> solution(int[] map_t, int input_t)
    {

        ArrayList<Integer> map = new ArrayList<>();

        if((map_t[input_t/2] == 1 ||map_t[input_t/2] == 0)) // 10, 22와 같은 수가 들어왔을때
        {
            map.add(input_t/2);
            map.add(input_t/2);
            return map;
        }else{
            for(int j = input_t/2 - 1; j >= 2 ; j--){
                if( (map_t[j] == 1 || map_t[j] == 0) && (map_t[input_t-j] == 0 || map_t[input_t-j] == 1)){
                    map.add(j);
                    map.add(input_t-j);
                    return map;                    
                }
            }
        } 
        return map;   
    }
}
