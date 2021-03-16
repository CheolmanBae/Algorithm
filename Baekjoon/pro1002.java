package Baekjoon;

import java.util.*;
import java.io.*;
import java.math.*;

public class pro1002 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int T= in.nextInt();
        double x1,y1,r1,x2,y2,r2;
        double l;

        double max = 0;
        double min = 0;

        ArrayList<Integer> output = new ArrayList<>();

        for(int i = 0; i < T; i++){
            x1 = in.nextDouble();
            y1 = in.nextDouble();
            r1 = in.nextDouble();
            x2 = in.nextDouble();
            y2 = in.nextDouble();
            r2 = in.nextDouble();

            if(r1>r2){
                max = r1;
                min = r2;
            }else{
                max = r2;
                min = r1;
            }

            l = Math.sqrt(Math.abs(x2-x1) * Math.abs(x2-x1) + Math.abs(y2-y1) * Math.abs(y2-y1));

            if( (l == (max + min) || l == (max - min)) && l != 0){
                output.add(1);
            }else if( (l == (max + min) || l == (max - min)) && l == 0){
                output.add(-1);
            }
            else if(max - min < l && l < max + min){
                output.add(2);
            }else{
                output.add(0);
            }
        }

        for(int i = 0; i<output.size(); i++){
            System.out.print(output.get(i));

            if(i != output.size()-1){
                System.out.print("\n");
            }
        }
        return;
    }
}
