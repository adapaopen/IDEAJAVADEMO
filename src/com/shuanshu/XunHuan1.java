package com.shuanshu;

public class XunHuan1 {
    public static void main(String[] args){
        int w=5;
        for(int c=1;c<=5;c++){
            for (int j=1;j<=w-c;j++){
                System.out.print(" ");
            }
            for (int z=1;z<=2*c;z++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
