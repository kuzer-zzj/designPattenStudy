package com.study.design.absfactory;

import com.study.design.absfactory.factory.AbstractFactory;
import com.study.design.absfactory.factory.FactoryProducer;
import com.study.design.absfactory.interfac.Color;
import com.study.design.absfactory.interfac.Shape;

public class AbsFactoryPatternDemo {
    public static void main(String[] args) {
        AbstractFactory shape = FactoryProducer.getFactory("SHAPE");
        assert shape != null;
        Shape a = shape.getShape("CIRCLE");
        a.draw();

        AbstractFactory color = FactoryProducer.getFactory("COLOR");
        assert color != null;
        Color red = color.getColor("RED");
        red.fill();
    }
}
