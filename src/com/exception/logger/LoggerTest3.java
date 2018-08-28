package com.exception.logger;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/**
 * 设置日志的输出格式
 * Created by jibingbing on 2018/1/29.
 */
public class LoggerTest3 {
    static class MyFormatter extends Formatter {
        @Override
        public String format(LogRecord record) {
            return "<" + record.getLevel() + ">" + record.getMessage() + "\n";
        }
    }

    public static void main(String[] args) throws IOException{
        Logger myLogger = Logger.getLogger("myLogger");
        FileHandler fileHandler = new FileHandler("/Users/jibingbing/Desktop/logger.text");
        fileHandler.setFormatter(new MyFormatter());
        myLogger.addHandler(fileHandler);

        myLogger.info("这是一条普通提示信息");
        myLogger.warning("这是一条警告信息");
    }
}
