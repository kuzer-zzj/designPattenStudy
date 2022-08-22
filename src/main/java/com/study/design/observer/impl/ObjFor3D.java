package com.study.design.observer.impl;

import com.study.design.observer.interfac.Observer;
import com.study.design.observer.interfac.Subject;
import jdk.nashorn.internal.ir.CallNode;

import java.util.ArrayList;
import java.util.List;

/**
 *  一个实现订阅接口的 服务号
 */
public class ObjFor3D implements Subject {
    private List<Observer> observers = new ArrayList<Observer>();

    /**
     * 服务号消息
     */
    private String msg;

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        int index = observers.indexOf(observer);
        if (index > 0) {
            observers.remove(index);
        }
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(msg);
        }
    }

    public void setMsg(String msg) {
        this.msg = msg;

        notifyObservers();
    }
}
