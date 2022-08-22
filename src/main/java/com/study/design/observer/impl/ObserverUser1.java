package com.study.design.observer.impl;

import com.study.design.observer.interfac.Observer;
import com.study.design.observer.interfac.Subject;

public class ObserverUser1 implements Observer {

    private Subject subject;

    public ObserverUser1(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    public void update(String msg) {
        System.out.println("ObserverUser1 得到新消息 - - >"+msg +"我要记下来");
    }
}
