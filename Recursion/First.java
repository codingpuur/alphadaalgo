package Recursion;

public class First {
    public static void decno(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
    
        decno(n-1);
    
       }
        public static void main(String[] args){
            int n=10;
            decno(n);
        }
    
}
