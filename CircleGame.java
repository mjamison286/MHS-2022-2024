import java.util.*;
import java.io.*;

public class CircleGame{
   public static void main(String[] args){
      boolean[] arr = new boolean[21];
      int cutoff = 4;
      int counter = 1;
      int winner = -1;
      Arrays.fill(arr, true);
      while(checkSpots(arr)){
         for(int i = 0; i < arr.length; i++){
            if(arr[i]){
               counter++;
               
            }
            if(counter == cutoff && checkSpots(arr)){
               arr[i] = false;
               counter = 1;
            } 
         }
      }
      
      for(int i = 0; i < arr.length; i++){
         if(arr[i] == true){
            winner = i + 1;
         }   
      }
      System.out.println(arr.length + " " + cutoff + " " + winner);
   }
   
   public static boolean checkSpots(boolean[] a){
      int count = 0;
      for(int i = 0; i < a.length; i++){
         if(a[i]){
            count++;
         }
      }
      if(count > 1){
         return true;
      } else if(count == 1){
         return false;
      }
      return false;
   } 
}

 