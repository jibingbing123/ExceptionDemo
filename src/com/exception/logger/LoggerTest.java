package com.exception.logger;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 在默认情况下,Logger只输出SERVER,WARNING,INFO这前三个级别
 * 级别从低到高为SERVER->WARNING->INFO
 * Created by jibingbing on 2018/1/29.
 */
public class LoggerTest {
    public static void main(String[] args) {
        Logger myLogger = Logger.getLogger("myLogger");
        //设置日志级别,只会输出WARNING级别或者比它低的级别日志
        myLogger.setLevel(Level.WARNING);
        myLogger.info("这是一条普通提示信息");
        myLogger.warning("这是一条警告信息");
        myLogger.severe("这是一条严重错误信息");
    }
}
