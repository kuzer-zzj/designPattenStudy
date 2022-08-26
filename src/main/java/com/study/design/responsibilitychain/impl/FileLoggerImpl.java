package com.study.design.responsibilitychain.impl;

public class FileLoggerImpl extends AbstractLogger {

    public FileLoggerImpl(int level) {
        this.level=level;
    }

    protected void write(String msg) {
        System.out.println("File::Logger: "+msg);
    }
}
