package com.study.design.absfactory.factory;

import com.study.design.absfactory.impl.Blue;
import com.study.design.absfactory.impl.Green;
import com.study.design.absfactory.impl.Red;
import com.study.design.absfactory.interfac.Color;
import com.study.design.absfactory.interfac.Shape;

public class ColorFactory extends AbstractFactory {
    public Color getColor(String color) {
        if(color == null){
            return null;
        }

        if(color.equalsIgnoreCase("RED")){
            return new Red();

        }else if(color.equalsIgnoreCase("GREEN")){
            return new Green();

        }else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }

        return null;
    }

  public   Shape getShape(String shape) {
        return null;
    }
}
