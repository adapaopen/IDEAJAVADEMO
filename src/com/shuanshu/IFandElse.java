package com.shuanshu;

import java.util.Scanner;

public class IFandElse {
    public static void main(String[] args){
//        if(条件){
//            代码块
//        }

//        double price1,price2;
//        price1 = 80;
//        price2 = 55;
//
//        double sum = price1 + price2;
//        System.out.println("原价为："+sum);
//        if(sum >= 100){
//            sum -= 20;
//        }
//        System.out.println("折扣后价为："+sum);

//        int n = 101;
        //从键盘接收数据
        System.out.println("请输入一个整数");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(n%2 == 0){
            System.out.println("n是偶数");
        }
        else{
            System.out.println("n是奇数");
        }

    }
}
