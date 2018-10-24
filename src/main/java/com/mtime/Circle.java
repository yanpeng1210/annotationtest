package com.mtime;

public class Circle {
    private double radius;
    Circle(){
        radius = 0.0;
    }
    Circle(double r){
        radius = r;
    }
    double getPerimeter(){
        return 2*Math.PI*radius;
    }
    double getArea(){
        return Math.PI * radius * radius;
    }
    void disp (){
        System.out.println("圆半径=" + radius );
        System.out.println("圆周长=" + getPerimeter());
        System.out.println("圆面积=" + getArea());
    }
}
