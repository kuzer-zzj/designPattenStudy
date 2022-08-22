package com.study.design.observer.interfac;

/**
 * 观察者 需要实现该接口
 */
public interface Observer {

    /**
     *
     * @param msg
     */
    public void update(String msg);
}
