package Recursion;

public class Increseorder {
    public static void decno(int n){      /*printing decresing number 10 to 1 */
        if(n==10){
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
    
        decno(n+1);
    
       }

       public static int factorial(int n){    /*printing fectorial no */
        if(n==0){
           return 1;
        }
        // int fec= factorial(n-1);
        int fn = n* factorial(n-1);
        return fn;
       }
       public static int suminfac(int n){
        if(n==1){
            return 1;
        }
        int sum = n+suminfac(n-1);
        return sum;
       }

       public static int febonachi(int n){
           if(n==0){
            return 0;
           }
           if(n==1){
            return 1;
    
           }
           int feb1=febonachi(n-1);
           int feb2=febonachi(n-2);
    
           int feb=feb1+feb2;
           
           return feb;

       }



        public static void main(String[] args){
            int n=40;
            int arr[]={10,20,30};
            boolean s=isSorted(1,2);
            System.out.println(s);
            // factorial(n);
            // System.out.println(factorial(n));
            // System.out.println(febonachi(n));
            // System.out.print(febonachi(n)); 

        }
    
}
