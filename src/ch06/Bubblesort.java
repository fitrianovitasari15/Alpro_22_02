package ch06;

    public class Bubblesort {
        public static void main(String[] args){
            int[] arr = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
            for(int a=0 ; a<arr.length; a++){
                for(int b=0; b<arr.length-1; b++){
                    boolean data = arr [b] < arr [b+1];
                   
                    if(data){
                        int c = arr[b];
                        arr[b]= arr[b+1];
                        arr[b+1]= c;
                    }
                }
            } 
            System.out.println("Urutan Array (Bubble Sort) : ");
            for(int a=0; a<arr.length; a++){
                System.out.println(arr[a]+" ");
            }System.out.println("");
        }
    
}