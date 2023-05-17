package Array;

public class Subarray {
    public static void main(String[] args){
        int arr[]={1,3,4,5,7};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int j2 = i; j2 <= j; j2++) {
                    System.out.print(arr[j2]);
                    
                }
                System.out.println();
            }
            System.out.println();
            
        }
    }
    
}
