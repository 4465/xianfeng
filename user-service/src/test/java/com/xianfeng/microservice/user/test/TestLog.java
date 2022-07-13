package com.xianfeng.microservice.user.test;

import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;

public class TestLog {

    private static final Logger logger = Logger.getLogger(TestLog.class);

    @Test
    public void testLog(){
        logger.debug("洗漱");
        logger.debug("吃早饭");


        logger.info("坐公交上班");


        logger.warn("有人踩了我一脚");

        logger.error("他不让我走");

        logger.info("上班");
    }
}
