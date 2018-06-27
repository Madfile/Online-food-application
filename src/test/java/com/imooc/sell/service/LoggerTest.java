package com.imooc.sell.service;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.runner.RunWith;

@RunWith(SpringRunner.class)
@SpringBootTest
//@Slf4j  //可以不用在开头初始化类，来自于lombok包
public class LoggerTest {

    //每次都要getLogger自己的类，不写或写在别的类就没用,或者使用@Slf4j
    private final Logger logger = LoggerFactory.getLogger(LoggerTest.class);

    @Test
    public void test1(){

        logger.debug("debug...");
        //log.debug("debug...");  //@Slf4j后直接使用log.()
        logger.info("info...");
        //log.info("info...");
        logger.error("error...");
        //log.error("error...");
    }
}
