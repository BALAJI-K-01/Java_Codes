import java.util.*;
public class PrimeInRangee {
    public static void main(String[] args) {

        int range = 10;
        LinkedList<Integer> arr = new LinkedList<>();

        for(int i=2;i<range;i++){

            if(prime(i)){
                arr.add(i);
            }
        }
        for(int a : arr){
            System.out.print(a+" ");
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

