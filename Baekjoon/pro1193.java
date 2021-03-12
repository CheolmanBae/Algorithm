package Baekjoon;

import java.util.*;

public class pro1193{
    public static void main(String[] args){
        int X;
        Scanner in = new Scanner(System.in);
        X = in.nextInt();
        int con = 0;
        int a = 1;
        int b = 1;
        int cnt = 0;
        boolean rl_flag = true; // true면 오른쪽으로, falas면 아래쪽으로
        boolean up_flag = false; // true면 a증가 b감소, falas면 a감소 b증가

        if (X == 1)
        {
            System.out.printf("%d/%d", a , b);
            return;
        }
        int tmp = X;

        while(true){
            con++;
            tmp = tmp - con;
            rl_flag = !rl_flag;
            up_flag = !up_flag;
            if(tmp < 0){
                break;
            }
            cnt = cnt + con;
        }
       
        if(rl_flag){    // 오른쪽으로 x좌표쪽으로
            a = 1;
            b = con -1;
        }else{          // 아래쪽으로 y좌표쪽으로
            a = con -1;
            b = 1;
        }
        for(int i = 1; i<=con; i++){
            if (X == cnt){
                System.out.printf("%d/%d", a , b);
                return;
            }
            if(i==1){
                if(con % 2 == 0){
                    b = b + 1;
                    up_flag = false;
                }else{
                    a = a + 1;
                    up_flag = true;
                }
                cnt++;
                continue;
            }
            if(up_flag){
                a--;
                b++;
            }else{
                a++;
                b--;
            }
            cnt++;
        }
    }
}