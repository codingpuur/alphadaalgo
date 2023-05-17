public class spiral {
    
    public static void main(String[] args){
    
        int arr[][]= {
     {1,2,3,4},
     {5,6,7,8},
     {9,10,11,12},
     {13,14,15,16},
     {17,18,19,20}};
     int left=0;
     int top=0;
     int right=3;
     int bottom=4;

     while(left<=right && top <=bottom){
        for (int i = left; i <=right; i++) {
            System.out.print(arr[left][i]+" ");
            
        }
        top++;
        for (int i = top; i <= bottom; i++) {

              System.out.print(arr[i][right]+" ");
        }
        right--;
        for (int i = right; i >= left; i--) {
            System.out.print(arr[bottom][i]+" ");
            
        }
        bottom--;
    
        for (int i = bottom; i >= top; i--) {
            System.out.print(arr[i][left]+" ");

            
        }
        left++;
     }
   
    }
    
}
