package com.shuanshu;

import java.util.Scanner;

public class YangDemo {
    public static void main(String[] args){
//        System.out.println("请输入年份：");
//        Scanner s = new Scanner(System.in);
//        int n = s.nextInt();
//        if (((n%4==0)&(n%100!=0))|(n%400==0)){
//            System.out.println(n+"是闰年");
//        }
//        else{
//            System.out.println(n+"不是闰年");
//        }
        System.out.println("请输入成绩：");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if (n>90){
            System.out.println("优秀");
        }
        else if(n>80){
            System.out.println("粮");
        }
        else if(n>60){
            System.out.println("中");
        }
        else{
            System.out.println("不及格");
        }
    }
}
