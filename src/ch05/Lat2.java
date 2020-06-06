package ch05;

public class Lat2 {
    public int kadane(int[] arr) {
        int a = 0;
        int b = 0;
        for (int i = 0; i < arr.length; i++) {
         a += arr[i];
         if (a < 0) {
            a = 0;
         }
         if (b < a) {
          b = a;
         }
        }
        return b;
       }  
       public static void main(String args[]) {
        int arr[] = { 2, 7, -5, -7, 2, 5, -1, 8 };

        System.out.print("PANJANG ARRAY = ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        Lat2 c = new Lat2();

        System.out.println();
        System.out.println("NILAI MAX UNTUK SUBARRAY = "
        + c.kadane(arr));
       }
}