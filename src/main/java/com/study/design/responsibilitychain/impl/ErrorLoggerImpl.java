package com.study.design.responsibilitychain.impl;

public class ErrorLoggerImpl extends AbstractLogger {

    public ErrorLoggerImpl(int level) {
        this.level =level;
    }

    protected void write(String msg) {
        System.out.println("Error Console::Logger: "+msg);
    }
}
