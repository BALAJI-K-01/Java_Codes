//To-do list program
// package Java_Collections;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Daily{

    int Day;
    String give;

    public Daily(int Day,String give){
        this.Day = Day;
        this.give = give;
    }
}

public class Arraylist {

    public static void main(String args[]){
    ArrayList<Daily> lis = new ArrayList<Daily>();
    

    Daily d1 = new Daily(1,"Jogging");
    Daily d2 = new Daily(2,"Walking");

    lis.add(d1);
    lis.add(d2);

    for(Daily d:lis){
        System.out.println("Day : "+d.Day+"  Done : "+d.give+"\n---------------------");
    }
    






    // Iterator<Integer> i = lis.iterator();

    // System.out.println(i.next());
    }
    

    


    
}
