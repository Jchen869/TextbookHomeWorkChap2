import java.util.Scanner;
/**
 * Class: Paint
 * @author Joey Chen
 * @version 1.0
 * Course: ITEC 2140 - 04, Spring 2023
 * Written: February 7, 2023
 * This code will calculate the amount of paint in gallons and quarts needed to paint a room
 */
public class Paint {
    public static void main(String[] args){
        int window = 15;
        int door = 21;
        int coversG = 350;
        double coversQ = 1400;

        Scanner enterLength = new Scanner(System.in);
        System.out.print("Enter length: ");
        int length = enterLength.nextInt();
        Scanner enterWight = new Scanner(System.in);
        System.out.print("Enter wight: ");
        int wight = enterWight.nextInt();
        Scanner enterHeight = new Scanner(System.in);
        System.out.print("Enter height: ");
        int height = enterHeight.nextInt();

        System.out.println("Gallons of paint needed: " + (length * wight * height + window + door) / coversG
                + " gallons.");
        System.out.println("Quarts of paint needed: " + (length * wight * height + window + door) / coversQ
                + " quarts.");

    }
}