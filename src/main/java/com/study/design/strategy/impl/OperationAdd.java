package com.study.design.strategy.impl;

import com.study.design.strategy.interfac.Strategy;

public class OperationAdd implements Strategy {
    public int doOperation(int num1, int num2) {
        return num1+num2;
    }
}
