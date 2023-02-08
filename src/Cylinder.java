import java.util.Scanner;
/**
 * Class: Cylinder
 * @author Joey Chen
 * @version 1.0
 * Course: ITEC 2140 - 04, Spring 2023
 * Written: February 7, 2023
 * This program will calculate the base radius and volume of a cylinder.
 * Users being able to input their own radius and heights
 */
public class Cylinder {
    public static void main(String[] args){
        double pi = 3.1416;

        Scanner enterRad = new Scanner(System.in);
        System.out.print("Enter radius then click enter: ");
        int radiusRad = enterRad.nextInt();
        System.out.println("Base radius is " + radiusRad * radiusRad * pi);

        Scanner enterRadius = new Scanner(System.in);
        System.out.println("Enter radius: ");
        int radiusRadius = enterRadius.nextInt();
        Scanner enterHeight = new Scanner(System.in);
        System.out.println("Enter height: ");
        int radiusHeight = enterHeight.nextInt();
        System.out.print("Volume is " + radiusHeight * radiusRadius * radiusRadius * pi);

    }
}
