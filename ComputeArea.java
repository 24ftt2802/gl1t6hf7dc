package Practical_3;

public class ComputeArea {
    public static void main (String[]args){

        // Area of square = base x base
        // Area of triangle =1/2 x base x height
        // Area of circle = pi x r x r
        double base = 4.0;
        double height = 6.0;
        final double pi = 3.14;
        double radius = 8.0;
        double areaOfSquare = base*base;
        double areaOfTriangle = base*height;
        double areaOfcircle = pi*radius*radius;

        System.out.println("The area of square is "+areaOfSquare);
        System.out.println("The area of triangle is  "+(areaOfTriangle*1/2));
        System.out.println("The area of circle is "+areaOfcircle);
                         
        
        
    
    }









    


 }

 