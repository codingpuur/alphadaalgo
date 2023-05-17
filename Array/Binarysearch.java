package Array;

public class Binarysearch {
    public static void main(String[] args){
        int arr[]={1,3,4,5,7,9,10,18}; /*binary search is only perform on sorted araay this is a sorted array */
        int start=0;           /* start and end helps us to clculate the mid of the array */
        int end=arr.length;

         int key=10;
         while (start<=end) {
            int mid=(start+end)/2; /* with the help of start and end we found the mid position of the array */
            if(arr[mid]==key){ /*if mid and our key value  is equal we found the key  */
                System.out.println("key is present on position =" + mid);
            }
            if(key>arr[mid]){ /*ager humari key mid se bdi aa rhi hogi to hum start ki position of mid ki agli position de denge aur again uska dubara mid nikalenge and loop is run until  */
                start=mid+1;

            }
            else{
                end= mid-1;
            }
            
         }
    }
    
}
