import java.util.Scanner;

public class Palindrome {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        
        int option = 0;

        while(option!=1 && option!=2){
            System.out.println("Click 1(Number) or 2(string) or click 0 to break");
            option = sc.nextInt();
            if(option == 0){
                break;
            }
        else if(option==2){
        String s = sc.next();
        s = s.toUpperCase();

        if(s.equals(isString(s))){System.out.println("palindrome");}
        else{System.out.println("Not a palindrome");}
        }
        else if(option==1){
            int n = sc.nextInt();
            String s = Integer.toString(n);
            s = s.toUpperCase();

            if(s.equals(isString(s))){System.out.println("palindrome");}
            else{System.out.println("Not a palindrome");}

        }
        else{
            System.out.println("Invalid !\nEnter again");
        }
    }

    
    }

    static String isString(String s){

        char[] c = s.toCharArray();
        int len = c.length;
        int a = 0;
        char[] check = new char[len];

        for(int i = len-1;i>=0;i--){
            check[a] = c[i];
            a++;
        }

        String str = new String(check);
        return str;
        

    }
}
