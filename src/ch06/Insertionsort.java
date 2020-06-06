package ch06;

    public class Insertionsort {
        public static void main(String[] args) {
            int[] arr = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
            for(int a = 1 ; a<arr.length; a++){
                for(int b=a; b>=1; b--){
                    boolean data = arr [b] < arr [b-1];
                   
                    if(!data){
                        break;
                    }
                    int c = arr[b];
                    arr[b]=arr[b-1];
                    arr[b-1] = c;
                }
            } 
            print(arr);
            
        }
        public static void print(int[] arr){
            System.out.print("Urutan Array (Insertion Sort): ");
                for(int a=0; a<arr.length; a++){
                    System.out.print(arr[a]+" ");
                }System.out.println("");
        }
}