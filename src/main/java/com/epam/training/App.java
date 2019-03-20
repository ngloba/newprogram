package com.epam.training;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        hello("world");
        hello("Nataliia");
        hello("user");

        double l = 5;
        double m =12;
        System.out.println("Square of "+ l +" = "+ area(l));
        System.out.println("Square of with sides " + l+ " and "+ m + " = " +area(l,m));
    }

    public static void hello(String somebody) {

        System.out.println( "Hello " + somebody + " !" );
    }

    public static double area(double len) {
        return len*len;
    }

    public static double area(double a, double b) {
        return a*b;
    }
}
