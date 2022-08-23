package com.study.design.strategy;

import com.study.design.strategy.impl.OperationAdd;

public class StrategyPatternDemo {
    public static void main(String[] args) {

        OperationAdd operationAdd = new OperationAdd();
        Context context = new Context(operationAdd);
        int i = context.exeOperationStrategy(2, 4);
        System.out.println(i);


    }
}
