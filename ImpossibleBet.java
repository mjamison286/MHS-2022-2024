import java.util.*;
import java.io.*;

public class ImpossibleBet{
   
   public static boolean play(int num){
      if(num % 2 != 0){
         System.out.println("Enter an even number.");
         return false;
      }
      ArrayList<Integer> intarr = new ArrayList<Integer>();
      for(int i = 0; i < num; i++){
         intarr.add(i);
      }
      Collections.shuffle(intarr);
      
      for(int i = 0; i < num; i++){
         int num2 = i;
         boolean found = false;
         for(int o = 0; o < num / 2; o++){
            if(intarr.get(num2) != i){
               num2 = intarr.get(num2); 
            } else {
               found = true;
            }  
         }
         if(!found){
            return false;
         }
      }
      return true;
   }
   
   public static double percentage(int tri, int players){
      boolean[] arr = new boolean[tri];
      int count = 0;
      double db = arr.length;
      for(int i = 0; i < arr.length; i++){
         arr[i] = ImpossibleBet.play(players);
      }
      for(int i = 0; i < arr.length; i++){
         if(arr[i]){
            count++;
         }
      }
      double per = count / db * 100;
      return per;
   }
}