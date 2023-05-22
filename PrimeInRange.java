import java.util.*;
public class PrimeInRange {
    public static void main(String[] args) {

        int range = 10;
        int c = 0;
        for(int i=2;i<range;i++){

            if(prime(i)){
                System.out.print(i+" ");
            }
        }
        
    }
    static boolean prime(int n){

        int count = 0;
        boolean flag;
        if(n==1||n==0){
             count = 2;}
        
        
        for(int i=1;i<=n;i++){

            if(n%i==0){
                count++;
            }
    }
    if(count>2){flag = false;}
    else{flag = true;}
    return flag;
}
}

