package com.realdolmen.greeting;

public class Main {

    public static void main(String[] args) {
        HelloService hs= new HelloService();
        System.out.println(hs.sayHello(args[0]));       ;
    }
}
