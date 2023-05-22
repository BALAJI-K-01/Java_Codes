import java.math.BigInteger;

public class factorial {
    public static void main(String[] args) {

        long n = 19L;
        long fac =1L;
        for(int i=1;i<=n;i++){
            fac*=i;
        }
        System.out.println("Factorial of "+n+" is "+fac);

    
    
    }
}
