package ex2.src;

import java.util.Scanner;

import entities.Product;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        Product product = new Product();

        System.out.println("Enter product data:");
        System.out.print("Name: ");
        product.name = in.nextLine();
        System.out.print("Price: ");
        product.price = in.nextDouble();
        System.out.print("Quantity in stock: ");
        product.quantity = in.nextInt();
        System.out.println("Updated data: " + product.toString());

        System.out.println("Enter the number of products to be added in stock: ");
        product.addProducts(in.nextInt());
        System.out.println("Updated data: " + product.toString());

        System.out.println("Enter the number of products to be removed from stock: ");
        product.removeProducts(in.nextInt());
        System.out.println("Updated data: " + product.toString());

        in.close();
    }
}
