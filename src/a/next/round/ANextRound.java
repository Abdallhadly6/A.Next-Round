package a.next.round;

import java.util.ArrayList;
import java.util.Scanner;

public class ANextRound {
    public static Scanner inp = new Scanner(System.in);
    public static void main(String[] args) {
        int count , min , data ;
        int Final = 0;
        count = inp.nextInt();
        min = inp.nextInt();
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i = 0 ; i < count ; i++){
            data = inp.nextInt();
            temp.add(data);
        }
        for(int i = 0 ; i < temp.size() ; i++){
            if(temp.get(i) >= temp.get(min-1) && temp.get(i) > 0){
               Final+=1;
            }
        }
        System.out.println(Final);        
    }
    
}
