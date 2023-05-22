import java.io.*;
import java.util.Scanner;
public class Fibonacci{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Fibonnacci(13);
        


    
    }

    static void Fibonnacci(int num){

        int a = 0;
        int b = 1;
        int c;
        // String s = Integer.toString(num);
        // System.out.println(s);
        int[] list = new int[num];
        list[0] = a;
        list[1] = b;

        for(int i=2;i<num;i++){
            c = a+b;
            a=b;
            b=c;
            list[i] = c;
            
        }
        for(int z:list){
            System.out.print(z+" ");
        }

        int sum = 0;
        for(int i=0;i<list.length-1;i++){
            sum = sum+list[i];
        }
        sum+=1;
        System.out.println("\nIt sum is "+sum);
    }
}