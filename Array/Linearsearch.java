package Array;



public class Linearsearch {
   
 
    public static void main(String[] args){
        int arr[]={1,3,4,5,7};
        int key=5;
        for (int i = 0; i < arr.length; i++) {
            if(key==arr[i]){
                System.out.println("key is present on position ="+i);
            }
            
        }
    }
    
}
