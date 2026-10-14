package aplication;

import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            
        double xA, xB, xC, yA, yB, yC;

        System.out.println("Enter the measures of triangle X: ");

        xA = in.nextDouble();
        xB = in.nextDouble();
        xC = in.nextDouble();


        System.out.println("Enter the measures of triangle Y: ");

        yA = in.nextDouble();
        yB = in.nextDouble();
        yC = in.nextDouble();


        double p = (xA + xB + xC) / 2.0;
        double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

        double p2 = (yA + yB + yC) / 2.0;
        double areaY = Math.sqrt(p2 * (p2 - yA) * (p2 - yB) * (p2 - yC));

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
