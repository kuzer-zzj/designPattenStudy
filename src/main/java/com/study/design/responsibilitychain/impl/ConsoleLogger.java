package com.study.design.responsibilitychain.impl;

public class ConsoleLogger extends AbstractLogger{

    public ConsoleLogger(int level) {
        this.level=level;
    }

    protected void write(String msg) {
        System.out.println("Standard Console::Logger "+msg);
    }
}
