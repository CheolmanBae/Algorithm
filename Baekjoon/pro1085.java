package Baekjoon;

import java.util.*;
import java.io.*;
import java.math.*;

public class pro1085 {
    public static void main(String[] args) throws IOException{

        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int w = in.nextInt();
        int h = in.nextInt();

        int[] data = new int[4];

        data[0]=x;
        data[1]=y;
        data[2]=w-x;
        data[3]=h-y;

        Arrays.sort(data);

        System.out.print(data[0]);

        return;
    }
}
