package com.service.testupcase3.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestTestupcase3 {

        Testupcase3Delegate testupcase3Delegate = new Testupcase3Delegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = testupcase3Delegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}