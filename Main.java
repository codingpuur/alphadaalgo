public class Main{
  public static void mergesort(int arr[],int si , int ei){
    if(si>=ei){
      return;
    }
    int mid=si+(ei-si)/2;

    System.out.print( "si = "+si+" , "+"ei = "+ mid +"left");
    System.out.println();
    mergesort(arr, si, mid);
    System.out.println();
    System.out.print( "si = "+(mid+1)+" , "+"ei = "+ ei+"right");
    System.out.println();
    mergesort(arr, mid+1, ei);

    
  }
  public static void main(String[] args){
    int arr[] ={1,5,3,4,7};
    mergesort(arr, 0, arr.length-1);

  }
}