import java.util.Scanner;
/**
 * Class: Paint
 * @author Joey Chen
 * @version 1.0
 * Course: ITEC 2140 - 04, Spring 2023
 * Written: February 7, 2023
 * given the length, wight, height, of the room number of the windows and number of door
 * the program will calculate the gallons and quarts of paint are needed to paint the room.
 * for gallons print an integer value for the quarts print a real number no need to round down to integer
 * Assume that (1) ceiling is painted, (2) 1 gallon of paint covers about 350 square feet,
 * (3) each window is 15 square feet, and (4) each door is 21 square feet.
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