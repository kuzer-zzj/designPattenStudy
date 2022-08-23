package com.study.design.strategy;

import com.study.design.strategy.interfac.Strategy;

public class Context {
    Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int exeOperationStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
}
