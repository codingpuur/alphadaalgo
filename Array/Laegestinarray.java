package Array;

public class Laegestinarray {

    public static void main(String[] args){
        int arr[]={1,3,4,5,7};
        int large=0;
        for (int i = 0; i < arr.length; i++) {
            if(large<arr[i]){
                large=arr[i];
            }
            
        }
        System.out.println("largest value in this array is =" +large);
    }
   
    
}
