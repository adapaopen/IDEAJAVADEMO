package com.shuanshu;

import java.util.Scanner;

public class LuoJi {
    public static void main(String[] args){
        System.out.println("请输入一个数：");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        if(!(a%3==0)){
            System.out.println("a不能被三整除");
        }
        else{
            System.out.println("a可以被三zc");
        }
    }
}
