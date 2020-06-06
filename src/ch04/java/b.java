package ch04;

import java.util.Scanner;

/**
 *
 * @author Fitria Novitasari
 */
public class a {
    public static void main (String[] args){
        int [] nilai ={92, 12, 51, 38, 29, 26, 19, 48, 10, 55, 28, 32, 5};
        
	System.out.print("Cari angka : ");
        
	Scanner cariX = new Scanner (System.in);	
	int cari = cariX.nextInt();
	boolean ketemu = false;

	for (int i=0;i<nilai.length;i++){
		if(nilai[i]==cari){
		   System.out.println("Angka "+cari+" ada di index ke "+i);  
		   ketemu=true;
		}
		
        }
	if (ketemu == false){
	   System.out.println("Angka "+cari+" tidak ditemukan");
	}
    }
}

