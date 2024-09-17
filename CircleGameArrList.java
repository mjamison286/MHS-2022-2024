import java.util.*;
import java.io.*;

public class CircleGameArrList{
   public static void main(String[] args){
      ArrayList<Integer> list = new ArrayList<Integer>();
      int listSize = 21;
      for(int i = 1; i < listSize + 1; i++){
         list.add(i);
      }
      int pos = 0;
      int counter = 2;
      int interval = 4;
      while(list.size() != 1){   
         if(counter == interval){
            list.remove(pos);
            counter = 2;
            if(pos == list.size()){
               pos = 0;
            }
         } else {
            counter++;
            pos++;
         }
         if(pos >= list.size()){
            pos = pos - list.size();
         }
      }
      
      int winner = list.get(0);
      System.out.println(listSize + " " + interval + " " + winner);
   }
}