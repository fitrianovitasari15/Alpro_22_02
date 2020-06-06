package ch06;

public class Selectionsort {
    public static void main(String[] args) {
        int[] arr = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        for(int i = 0; i < arr.length-1; i++){
            int x = i;
            for(int j = i; j < arr.length; j++){
                boolean urutan = arr[j] < arr[x];
                if(urutan){
                x = j;
                }
            }
            int y = arr[i];
            arr[i] = arr[x];
            arr[x] = y;
        }
        print(arr);
    }

    public static void print(int[] arr) {
        System.out.print("Urutan Array (Selection Sort) = ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        } 
        System.out.println("");      
    }
        
}