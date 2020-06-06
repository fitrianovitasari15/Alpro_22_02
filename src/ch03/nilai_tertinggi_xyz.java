/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch03;

/**
 *
 * @author Fitria Novitasari
 */
public class nilai_tertinggi_xyz {
    public static void main(String[] args) {
     int x = 15;
     int y = 5;
     int z = 9;

     System.out.println("nilai x = " + x);
     System.out.println("nilai y = " + y);
     System.out.println("nilai y = " + z);

     if (x > y && x > z)  {
         System.out.println("nilai tertinggi = " + x);

      } else if (y > x && y > z) {
         System.out.println("nilai tertinggi = " + y);

      }else{
          System.out.println("nilai tertinggi = " + z);

      }
     }
}
