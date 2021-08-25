package edu.murraystate.csc425.setup;

import org.junit.Assert;
import org.junit.Test;

public class HelloTest {
  @Test
  public void helloTest(){
    final Hello hello = new Hello();
    final String expected = "hello";
    final String result = hello.hello();
    Assert.assertEquals(expected, result);
  }

}