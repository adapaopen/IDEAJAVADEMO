package com.imooc.animal;

public class CatTest{

    public static void main(String[] args){
        Cat erha = new Cat("二娃啊");
        erha.age = 15;
        erha.nickname = "二娃";
        erha.typecat = "二哈";
        erha.tizhong = 10.6;

        System.out.println("age:"+erha.age+"nickname"+erha.nickname);
        erha.run();
        erha.eat();

        erha.run(erha.nickname);
    }

}
