public class Reverse_Number{

    public static void main(String args[])
    {

        int num = 1234;
        String len = Integer.toString(num);
        int[] comp = new int[len.length()];
        int i = 0;

        while(num!=0){

            comp[i] = num%10;
            num/=10;
            i++;
            
        }
        for (int a:comp)
        System.out.print(a);}
    }
