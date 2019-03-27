package com.epam.training2;

public class App {
    public static void main(String[] args){

        Point p1 = new Point(15,32);
        Point p2 = new Point(2,6);

        System.out.println("The distance between 2 points is "+ Point.distance(p1, p2));
    }
}
