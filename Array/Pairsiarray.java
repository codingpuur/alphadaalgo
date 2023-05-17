package Array;

public class Pairsiarray {

    public static void main(String[] args){
        int arr[]={1,3,4,5,7};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                System.out.print("{"+ arr[i] +","+arr[j] +"}");
                
            }
            System.out.println();
        }

    }
    
}
