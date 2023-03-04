/**
 *
 * @author Trevor Hartman
 * @author Geng Cha
 *
 * @since Version 1.0
 *
 */

import java.util.Scanner;

public class Lab006{
    private int n;
    private int m;

    /**
     *
     * @param n creates an object using n
     * @param m creates an object using m
     */
    public Lab006(int n, int m){
        this.n = n;
        this.m = m;
    }

    /**
     *
     * @return boolean to see if n is divisible by m
     */
    public boolean isDivisible(){

        if (n % m == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        System.out.println("AYO COMRADE, TYPE IN YO NUMBER");
        Scanner askingPolitely = new Scanner(System.in);

        int numberStorage1 = askingPolitely.nextInt();

        System.out.println("I'M SO SORRY TO ASK AGAIN, BUT... IMMA NEED ANOTHER ONE");
        int numberStorage2 = askingPolitely.nextInt();

        Lab006 dragon = new Lab006(numberStorage1, numberStorage2);

        boolean geppo = dragon.isDivisible();

            System.out.println("=== TEST RESULT ===");
            System.out.printf("FIRST NUMBER is %s%nSECOND NUMBER is %s%nTHE RESULT MY COMRADE, IS IT AN EVEN NUMBER? THE RESULT IS: %b%n", numberStorage1, numberStorage2, geppo);
            System.out.println("=== TEST ENDING ===");
            System.out.println("You've reached the finish line");

    }
}