package com.xworkz.shape.external;

import com.xworkz.shape.internal.Rectangle;


public class ShapeRunner {

        public static void main(String [] args){
            Rectangle rectangle=new Rectangle();

            rectangle.displayRectangle();
            System.out.println("   ");
            rectangle.displayPolygon();
            System.out.println("   ");
            rectangle.displayShape();


        }
    }

