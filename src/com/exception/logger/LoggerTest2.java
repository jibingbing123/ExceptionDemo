package com.exception.logger;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 把日志输出到文件
 * Created by jibingbing on 2018/1/29.
 */
public class LoggerTest2 {
    public static void main(String[] args) throws IOException{
        Logger myLogger = Logger.getLogger("myLogger");

        FileHandler fileHandler = new FileHandler("/Users/jibingbing/Desktop/logger.text");
        fileHandler.setLevel(Level.INFO);
        myLogger.addHandler(fileHandler);

        myLogger.info("这是一条普通信息提示信息");
        myLogger.warning("这是一条警告信息");
        myLogger.severe("这是一条严重错误信息");
    }
}
