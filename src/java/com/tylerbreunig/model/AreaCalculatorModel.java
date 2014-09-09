package com.tylerbreunig.model;
/**
 *
 * @author Tyler
 */
public class AreaCalculatorModel {

    public AreaCalculatorModel() {
        
    }
    
    public int calculateRectangle(int height, int width){
        return height * width;
    }
    
    public double calculateCircle(double radius){
        double pi = 3.14159265359;
        double radiusPowerOfTwo = radius * radius;
        double area = pi * radiusPowerOfTwo;
        return area;
    }
    
    public int calculateTriangle(int base, int height){
        int area = ((base * height)/2);
        return area;
    }
}
