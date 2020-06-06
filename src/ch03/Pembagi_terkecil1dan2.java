/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch03;
import java.util.Scanner;
/**
 *
 * @author Fitria Novitasari
 */
public class Pembagi_terkecil1dan2 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    int a = 0;
    int b = 2;
    
    System.out.println("PROGRAM MENENTUKAN BILANGAN PEMBAGI TERKECIL");
    System.out.print("Masukan Angka : ");
    a=input.nextInt();

    System.out.println("----------------------------------------------");
        while (b>=a) {
            if ( (a%b)!=0) {

            }else{
                System.out.println("pembagi bilangan terkecil = " + b);
                b=b+1;

            }
        }
}
}
