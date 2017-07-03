package com.realdolmen.greeting;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloServiceTest {
    @Test
    public void testSayHello() {
        HelloService helloService= new HelloService();
        String result = helloService.sayHello("Christian");
        assertEquals("Hello, Christian", result);


    }
}
