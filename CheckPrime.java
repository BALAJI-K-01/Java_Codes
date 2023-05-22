import java.util.*;
public class CheckPrime {
    public static void main(String[] args) {

        int n = 4;
        int count =prime(n);
        
        if(count>2){System.out.println(String.format("%d is not a prime number",n));}
        else{System.out.println(String.format("%d is a prime number",n));}


        }
        // for(int a:arr){
        //     System.out.println(a);
        // }
    
    

    static int prime(int n){

        LinkedList<Integer> arr = new LinkedList<Integer>();
        // int c=0;
        if(n==1||n==0){
            String str = String.format("%d is not a prime number",n);
        System.out.println(str);}
        int count = 0;
        
        for(int i=1;i<=n;i++){

            if(n%i==0){
                arr.add(i);
                count++;
            }
    }

    return count;
}
}

