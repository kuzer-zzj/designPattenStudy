package com.study.design.absfactory.factory;

import com.study.design.absfactory.interfac.Color;
import com.study.design.absfactory.interfac.Shape;

public abstract class AbstractFactory {
     public  abstract Color getColor(String color);

     public abstract Shape getShape(String shape);
}
