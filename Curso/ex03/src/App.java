package ex03.src;


import java.util.Scanner;
import ex03.src.entities.Rectangle;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.println("Enter rectangle width and height: ");
        rectangle.width = in.nextDouble();
        rectangle.height = in.nextDouble();

        System.out.println("AREA: " + rectangle.area());

        System.out.println("PERIMETER: " + rectangle.perimeter());
        System.out.println("Diagonal: " + rectangle.diagonal());
        


    }
}
