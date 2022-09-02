

package Exercises;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //15. Build an algorithm which receives a value and replies if this number is between 10 and 200.

        int value;

        Scanner readScanner = new Scanner(System.in);

        System.out.println("Enter a value: ");

        value = readScanner.nextInt();

        if (value >= 10 && value <= 200) {

            System.out.println("The number is between 10 and 200.");

        } else {

            System.out.println("The number is not between 10 and 200.");
        }

        //24. Build an algorithm that receives "N" numbers and replies whether they're positive, negative or zero.

        char wishToContinue = 'S';

        while(wishToContinue == 'S'  ||  wishToContinue == 's') {
            System.out.println("Digite um número: ");
            int thisNumber = readScanner.nextInt();

            if (thisNumber == 0) {
                System.out.println("It is zero!");
            } else {
                if (thisNumber > 0) {
                    System.out.println("It's positive!");
                } else {
                    System.out.println("It's negative!");
                }
            }
            System.out.println("Deseja continuar? S - Sim / N - Não");
            wishToContinue = readScanner.next().charAt(0);
        }

    }






}
