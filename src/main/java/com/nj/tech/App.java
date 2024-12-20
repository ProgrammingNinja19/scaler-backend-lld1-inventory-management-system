package com.nj.tech;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Inventory<Electronics> inventory = new Inventory<>();
        Electronics e1 = new Electronics("Moblie1","Apple Iphone 16",999.99,1,3);
        Electronics e2 = new Electronics("Laptop1","Dell Laptop 1",99.99,1,3);
        Electronics e3 = new Electronics("","Apple Iphone 16",999.99,1,3);

    }
}
