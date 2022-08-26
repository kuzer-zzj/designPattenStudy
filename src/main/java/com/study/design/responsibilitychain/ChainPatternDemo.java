package com.study.design.responsibilitychain;

import com.study.design.responsibilitychain.impl.AbstractLogger;
import com.study.design.responsibilitychain.impl.ConsoleLogger;
import com.study.design.responsibilitychain.impl.ErrorLoggerImpl;
import com.study.design.responsibilitychain.impl.FileLoggerImpl;

public class ChainPatternDemo {

    private static AbstractLogger getChainOfLogger() {
        ErrorLoggerImpl errorLogger = new ErrorLoggerImpl(AbstractLogger.ERROR);
        ConsoleLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
        FileLoggerImpl fileLogger = new FileLoggerImpl(AbstractLogger.DEBUG);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);
        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger chainOfLogger = getChainOfLogger();
        chainOfLogger.logMessage(AbstractLogger.DEBUG,"这是debug msg");
    }
}
