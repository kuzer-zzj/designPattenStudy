package com.study.design.observer.impl;

import com.study.design.observer.interfac.Observer;
import com.study.design.observer.interfac.Subject;

public class ObserverUser2 implements Observer {

    private Subject subject;

    public ObserverUser2(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    public void update(String msg) {
        System.out.println("ObserverUser2 收到新的消息 - ->"+msg+"喜大普奔！");
    }
}
