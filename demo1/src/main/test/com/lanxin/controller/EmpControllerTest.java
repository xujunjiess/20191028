package com.lanxin.controller;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2019/8/8.
 */
public class EmpControllerTest {

    @Test
    public void testSelectdname() throws Exception {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml","springmvc-servlet.xml");
        EmpController empController=(EmpController)context.getBean("empController");
        empController.selectdname();
    }
}