/*  Created by Yanto Setiawan
    Date:
 */

import java.util.Scanner;

public class Start {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        PersegiPanjang();
        Segitiga();
    }

    private static void PersegiPanjang() {
        //init
        PersegiPanjang PP = new PersegiPanjang();

        //input

        System.out.print("Masukkan panjang: ");
        PP.setP(input.nextInt());

        System.out.print("Masukkan lebar: ");
        PP.setL(input.nextInt());

        //output
        System.out.println("Luas Persegi Panjang= " + PP.LuasPersegiPanjang());
    }

    private static void Segitiga() {
        //init
        Segitiga SS = new Segitiga();

        //input
        System.out.print("Masukkan alas: ");
        SS.setA(input.nextInt());

        System.out.print("Masukkan tinggi: ");
        SS.setT(input.nextInt());

        //output
        System.out.println("Luas Segitiga= " + SS.LuasSegitiga());
    }
}
