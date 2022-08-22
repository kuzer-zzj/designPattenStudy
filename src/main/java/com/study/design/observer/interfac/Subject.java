package com.study.design.observer.interfac;

/**
 * 主体接口 所有订阅者都要实现该接口
 */
public interface Subject {

    /**
     * 注册一个观察者
     * @param observer
     */
    public void registerObserver(Observer observer);

    /**
     * 移除一个观察者
     * @param observer
     */
    public void removeObserver(Observer observer);

    /**
     * 通知所有观察者
     */
    public void notifyObservers();

}
