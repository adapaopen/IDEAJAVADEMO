package com.shuzhu;

import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args){
        int[][] intArray = new int[3][2];
        Scanner s = new Scanner(System.in);
        for (int w=0;w<intArray.length;w++){
            for (int n=0;n<intArray[w].length;n++){
                if(n==0){
                    System.out.println("请输入第"+(w+1)+"学生的语文成绩：");
                }else{
                    System.out.println("请输入第"+(w+1)+"学生的数学成绩：");
                }
                int cj = s.nextInt();
                intArray[w][n]= cj;
            }
        }
        int yusum=0,shusum=0;
        for (int w=0;w<intArray.length;w++){
            for (int n=0;n<intArray[w].length;n++){
                if (n==0){
                    yusum+=intArray[w][n];
                }else {
                    shusum+=intArray[w][n];
                }
            }
        }
        System.out.println("语文总成绩为："+yusum);
        System.out.println("语文平均分为："+(yusum/intArray.length));
        System.out.println("数学总成绩为："+shusum);
        System.out.println("数学平均分为："+(shusum/intArray.length));

    }
}

//        int[] arr = new int[10];
//        int sum = 0;
//        System.out.println(arr.length+" "+arr[1]);
//        for(int n=0;n<arr.length;n++) {
//            System.out.println("请输入：");
//            Scanner s = new Scanner(System.in);
//            int youInput = s.nextInt();
//            arr[n] = youInput;
//            sum +=arr[n];
//        }
//        System.out.println(sum);
//        int[] arr = {15,48,95,11,1,45,6,12,44,99,45,10,1,15,94,101};
//        int max = arr[0],min = arr[0];
//        for (int n=0;n<arr.length;n++){
//            if(arr[n]>=max){
//                max = arr[n];
//            }
//            if(arr[n]<=min){
//                min = arr[n];
//            }
//        }
//        System.out.println("max"+max+" min"+min);

//        int[] arr = {15,48,95,11,1,45,6,12,44,99,45,10,1,15,94,101};
//        System.out.print("排序前的数组为：");
//        for(int n:arr){
//            System.out.print(n+" ");
//        }
//        System.out.println();
//        int temp;
//        for(int n=0;n<arr.length-1;n++){
//            for(int k=0;k<arr.length-1-n;k++){
//                if(arr[k]>arr[k+1]){
//                    temp = arr[k];
//                    arr[k] = arr[k+1];
//                    arr[k+1] = temp;
//                }
//            }
//        }
//        System.out.print("排序后的数组为：");
//        for(int n:arr){
//            System.out.print(n+" ");
//        }
//二维数组的声明
//三种形式
//        int[][] intArray;
//        float floatArray[][];
//        double[] doublueArray[];

//        创建一个三很三列的int数组
//        int[][] intArray;
//        intArray = new int[3][3];
//        System.out.println("IntArray第三行二列"+intArray[2][1]);//intArray[行][列]
//        intArray[1][2] = 6;//第二行第三列的元素赋值
////        声明并且创建
//        char[][] ch = new char[3][5];
//        //创建float类型的数组时，只指定行数
//        float[][] floatArray = new float[3][];//列数可以省掉
//        floatArray[0]=new float[2];//第一行有3列
//        floatArray[1]=new float[5];//第二行有6列
//        int[][] num = {{1,2,3},{4,5,6,},{7,8,9}};
////        System.out.println(num.length);
////        System.out.println(num[0].length);
//        int[][] num1 = {{78,98},{589,484,59,4}};
////        System.out.println(num1[1].length);
//        for (int n=0;n<num1.length;n++){
//            for (int j=0;j<num1[n].length;j++){
//                System.out.print(num1[n][j]+" ");
//            }
//            System.out.println();
//        }