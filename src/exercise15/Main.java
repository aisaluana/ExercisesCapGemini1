//Build an algorithm which receives a number and replies if this number is between 10 and 200.

package exercise15;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int number;

        Scanner readScanner = new Scanner(System.in);

        System.out.println("Enter a number: ");

        number = readScanner.nextInt();

        if (number >= 10 && number <= 200) {

            System.out.println("The number is between 10 and 200.");

        } else {

            System.out.println("The number is not between 10 and 200.");
        }

    }



}
