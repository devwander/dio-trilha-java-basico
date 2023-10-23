package org.example;

public class Main {
    public static void main(String[] args) {
        SingletonLazy singleton = SingletonLazy.getInstance();
        System.out.println(singleton);
        singleton = SingletonLazy.getInstance();
        System.out.println(singleton);

        SingletonEager singletonEager = SingletonEager.getInstance();
        System.out.println(singletonEager);
        singletonEager = SingletonEager.getInstance();
        System.out.println(singletonEager);

        SingletonLazyHolder singletonLazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(singletonLazyHolder);
        singletonLazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(singletonLazyHolder);
    }
}