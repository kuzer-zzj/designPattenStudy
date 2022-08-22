package com.study.design.observer;

import com.study.design.observer.impl.ObjFor3D;
import com.study.design.observer.impl.ObserverUser1;
import com.study.design.observer.impl.ObserverUser2;

public class ObsServerTest {
    public static void main(String[] args) {
        //模拟创建一个服务号
        ObjFor3D objFor3D = new ObjFor3D();

        ObserverUser1 observerUser1 = new ObserverUser1(objFor3D);
        ObserverUser2 observerUser2 = new ObserverUser2(objFor3D);

        objFor3D.setMsg("1期号码：123");
        objFor3D.setMsg("2期号码：321");
        objFor3D.removeObserver(observerUser1);
        objFor3D.setMsg("3期号码：1111111111");

    }
}
