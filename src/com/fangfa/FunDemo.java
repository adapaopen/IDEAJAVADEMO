package com.fangfa;


import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Scanner;

public class FunDemo {

    //无参无返回值
    public void printStar(){
        for(int n=1;n<=20;n++){
            System.out.print("*");
        }
        System.out.println();
    }

    //无参有返回值
    public int area(int length,int width){
        int area = length*width;
        return area;
    }

    //带参无返回值
    public void max(float a,float b){
        if(a>b){
            System.out.println("A最大o");
        }else {
            System.out.println("B最大");
        }
    }

    //带参有返回值
    public int fac(int n){
        int sum=0;
        for(int c=1;c<=n;c++){
            int cc = 1;
            for (int j=1;j<=c;j++){
                cc*=j;
            }
            sum+=cc;
        }
        return sum;
    }

    //数组作为方法参数
    public void printArray(int[] arr){
        for(int n=0;n<arr.length;n++){
            System.out.println(arr[n]);
        }
    }

    //boolean返回值
    public boolean search(int[] arr,int a){
        for (int n=0;n<arr.length;n++){
            if (a==arr[n]){
                return true;
            }
        }
        return false;
    }
    //可变参数
    public int qiuhe(int... n){
        int sum =0;
        for(int a:n){
            sum+=a;
        }
        return sum;
    }

    public static void main(String[] args){
        FunDemo sc = new FunDemo();
        sc.printStar();
        System.out.println("欢迎来到JAVA的世界");
        sc.printStar();

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int qc = sc.qiuhe(1,2,3,4,5,6,7,8,9,10);
        System.out.println(qc);

////        sc.printArray(arr);
//        boolean s =sc.search(arr,15);
//        System.out.println(s);


//        Scanner ss = new Scanner(System.in);
//        System.out.println("请输入长：");
//        int length = ss.nextInt();
//        System.out.println("亲输入款");
//        int width = ss.nextInt();
//
//        int sum = sc.area(length,width);
//        System.out.println("面积为："+sum);

//        int a=16,b=33;
//        sc.max(a,b);

//        int bb = sc.fac(5);
//        System.out.println("阶乘"+bb);
    }


}
