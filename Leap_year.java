public class Leap_year {
    public static void main(String[] args) {
    
        int year = 2024;

        String leap = "Leap year";
        String nleap = "Not a leap year";
        // // System.out.println((year%400==0)?leap:((year%4==0)&&(year%100!=0)?nleap:"Invalid"));
        System.out.println((year % 400 == 0) ? leap : ((year % 4 == 0) && (year % 100 != 0) ? leap : nleap));
    }

}
