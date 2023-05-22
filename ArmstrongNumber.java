public class ArmstrongNumber {
    
    public static void main(String[] args) {
        
        int n = 407;

        String s = Integer.toString(n);
        char[] c = s.toCharArray();
        int power= c.length;
        int sum = 0;

        for(int i=0;i<power;i++){
            int get = Character.getNumericValue(c[i]);
            int p = (int)Math.pow(get, power);
            sum = sum + p;
            // System.out.println(sum);

        }
        
        if(n==sum){System.out.println(n+" is the Armstrong number");}
        else{System.out.println(n+" is not a Armstrong number");}
        
    
    }
}
