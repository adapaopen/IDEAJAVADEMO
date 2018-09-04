package com.shuanshu;

import java.util.Scanner;

public class XunHuan {
    public static void main(String[] args){
//        int sum=0,n=1;
//        while (n<=15){
//            if(n%2!=0){
//                sum+=n;
//                System.out.println("N"+n+"SUM"+sum);
//            }
//            n++;
//        }
//        char ch = 'a';
//        int count = 1;
//        while (ch<='z'){
//            System.out.print(ch);
//            if(count%13==0){
//                System.out.println();
//            }
//            count++;
//            ch++;
//        }

//        求1到5的累加和

//        int nicai = (int)(Math.random()*10+1);//随机数生成
//        int youinput = 0;
//        do{
//            Scanner x = new Scanner(System.in);
//            youinput = x.nextInt();
//            if(youinput>nicai){
//                System.out.println("BIG");
//            }else if(youinput<nicai){
//                System.out.println("M");
//            }else {
//                System.out.println("OK");
//                break;
//            }
//
//        }while (youinput != nicai);

//        int n,sum = 0;
//        for (n=1;n<=5;n++){
//            System.out.println(n);
//            sum += n;
//            System.out.println(sum);
//        }
//        System.out.println(n);


//        while (true){
//            Scanner x = new Scanner(System.in);
//            int s = x.nextInt();
//            System.out.println(s);
//            if (s==0)break;
//        }

//        int n = 265,ge,shi,bai;
//        bai = n/100;
//        shi = n/10%10;
//        ge = n%10;
//        System.out.println("bai"+bai+" shi"+shi+" ge"+ge);

//        int ge,shi,bai;
//        //使用for循环
//        for(int n=200;n<=300;n++){
//            //取出百位数
//            bai = n/100;
//            //取出十位数
//            ge = n%10;
//            //取出个位数
//            shi = n/10%10;
//            //计算三个数字之积
//            int ji = bai*ge*shi;
//            //计算三个数字之和
//            int he = ge+bai+shi;
//            //如果积等于42并且和为12，则将满足条件的数输出
//            if(ji==42& he==12){
//                System.out.println(n);
//            }
//        }

//        int ge,shi,bai;
//        //使用for循环
//        for(int n=200;n<=300;n++){
//            //取出百位数
//            bai = n/100;
//            //取出十位数
//            ge = n%10;
//            //取出个位数
//            shi = n/10%10;
//            //计算三个数字之积
//            if(bai*ge*shi==42){
//                System.out.println(n);
//                if(bai+ge+shi==12){
//                    System.out.println(n);
//                }
//            }

//        int w=1,n=1;
//        while (w<=10){
//            while (n<=w){
//                System.out.print("X");
//                n++;
//            }
//            System.out.println();
//            w++;
//            n=1;
//        }

        long s=1,sum=0;
        System.out.println("请输入阶乘数：");
        Scanner x = new Scanner(System.in);
        int jjq = x.nextInt();
        for(int i=1;i<=jjq;i++){
            for(int j=1;j<=i;j++){
                s*=j;
            }
            sum+=s;
            s=1;
        }
        System.out.println(sum);
    }
}
