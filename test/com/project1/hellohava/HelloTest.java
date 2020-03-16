package com.project1.hellohava;

import com.jason.HelloJava;
import org.junit.Assert;
import org.junit.Test;

public class HelloTest {

    @Test
    public void hellojava() {

    HelloJava hellojava = new HelloJava();
    Assert.assertEquals( expected:"Hello World",hellojava.getName() );
}
}
