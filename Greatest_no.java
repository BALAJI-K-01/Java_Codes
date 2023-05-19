public class Greatest_no {
    
    public static void main(String[] args){
        int arr[] = {10,45,25,56,22,777};
        int gre = 0;

        for(int i=0;i<arr.length-1;i++){

            if(arr[i]>arr[i+1]){
                gre = arr[i];
            }
            else{
                gre = arr[i+1];
            }
        }
        System.out.println(gre);
        
    }
}
