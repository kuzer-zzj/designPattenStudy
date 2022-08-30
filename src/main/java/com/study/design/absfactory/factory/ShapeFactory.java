package com.study.design.absfactory.factory;

import com.study.design.absfactory.impl.Circle;
import com.study.design.absfactory.impl.Rectangle;
import com.study.design.absfactory.impl.Square;
import com.study.design.absfactory.interfac.Color;
import com.study.design.absfactory.interfac.Shape;

public class ShapeFactory extends AbstractFactory {


    public  Color getColor(String color) {
        return null;
    }

   public  Shape getShape(String shapeType) {
         if (shapeType == null) {
             return null;
         }
         if(shapeType.equalsIgnoreCase("CIRCLE")){
             return new Circle();

         }else if(shapeType.equalsIgnoreCase("RECTANGLE")){
             return new Rectangle();

         }else if(shapeType.equalsIgnoreCase("SQUARE")){
             return new Square();
         }
         return null;
    }
}
