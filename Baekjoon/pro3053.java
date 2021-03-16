package Baekjoon;

import java.util.*;
import java.io.*;
import java.math.*;

public class pro3053 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int r = in.nextInt();
        double round = 0;
        double unround = 0;

        round = r * r * Math.PI;
        unround = r * r * 2;

        System.out.printf("%f\n", round);
        System.out.printf("%f", unround);

        return;
    }

}
