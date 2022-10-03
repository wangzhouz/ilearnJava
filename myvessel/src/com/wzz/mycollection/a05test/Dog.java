package com.wzz.mycollection.a05test;

public abstract class Dog extends Animal{
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("狗在吃东西");
    }
}
