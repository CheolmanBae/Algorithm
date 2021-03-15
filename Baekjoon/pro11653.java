package Baekjoon;

import java.util.*;
import java.io.*;
import java.math.*;

public class pro11653 {
    public static void main(String[] args) throws IOException{
        int n;
        Scanner in = new Scanner(System.in);
        n =in.nextInt();

        ArrayList<Integer> nlist = new ArrayList<>();

        for(int i = 2; i <= n; i++){
            while(true){
                if(n%i == 0){
                    nlist.add(i);
                    n /= i;
                }else{
                    break;
                }
            }
        }

        for(int k = 0; k < nlist.size(); k++){
            System.out.print(nlist.get(k));
            if(k!=nlist.size()-1){
                System.out.print("\n");
            }
        }
        return;

    }
}