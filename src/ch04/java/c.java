/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch04;

/**
 *
 * @author Fitria Novitasari
 */
public class b {
    public static void main (String[] args){
        int [] nilai ={92, 12, 51, 38, 29, 26, 19, 48, 10, 55, 28, 32, 5};
        
	System.out.println("Menampilkan semua nilai array : ");

	for (int i=0;i<nilai.length;i++){
	   System.out.print(nilai[i]+" ");  
        }
	System.out.println("\n");

	System.out.print("Hanya angka ganjil = ");
	for (int i=0;i<nilai.length;i++){
	   if (nilai[i]%2!=0){
	      System.out.print(nilai[i]+" ");
	   }
	}
    }
}
