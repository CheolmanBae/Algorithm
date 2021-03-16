package Baekjoon;

import java.util.*;
import java.io.*;
import java.math.*;

public class pro4153 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int[] data = new int[3];

        ArrayList<String> output = new ArrayList<>();

        while(true)
        {
            data[0] = in.nextInt();
            data[1] = in.nextInt();
            data[2] = in.nextInt();

            if(data[0]==0 && data[1]==0 && data[2]==0){
                break;
            }
            Arrays.sort(data);

            if( (data[0] * data[0]) + (data[1]*data[1]) == (data[2]*data[2])){
                output.add("right");
            }else{
                output.add("wrong");
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
