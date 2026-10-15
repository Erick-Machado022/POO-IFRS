package aplication;
import entities.*;

import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            
        Triangle x, y;

        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of triangle X: ");

        x.a = in.nextDouble();
        x.b= in.nextDouble();
        x.c = in.nextDouble();


        System.out.println("Enter the measures of triangle Y: ");

        y.a = in.nextDouble();
        y.b = in.nextDouble();
        y.c = in.nextDouble();


        
        double areaX = x.area();

        
        double areaY = y.area();

        System.out.printf("Triangle X area: %.4fn", areaX);
        System.err.println();
        System.out.printf("Triangle Y area: %.4fn", areaY);
        System.out.println();

        if (areaX > areaY) {
            System.out.printf("Triangulo X tem a maior area: %.4fn", areaX);
        }else{
                        System.out.printf("Triangulo Y tem a maior area: %.4fn", areaY);

        }






        in.close();
    }
}
