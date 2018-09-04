package com.imooc.animal;

/**
 * 宠物猫类
 */
public class Cat {
    //成员属性：nickname，体重，品种，age。
    String nickname;
    double tizhong;
    String typecat;
    int age;

    //构造方法
    public Cat(){
        System.out.println("这构造方法print");
    }
    public Cat(String name){
        System.out.println(name+"这构造方法print");
    }

    //成员方法  跑 吃
    public void run(){
        System.out.println("猫游九天");
    }

    public void run(String name){
        System.out.println(name+ "游九天");
    }

    public void eat(){
        System.out.println("吞天食日");
    }

}
