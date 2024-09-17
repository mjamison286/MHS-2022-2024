import java.util.*;
import java.io.*;

public class WeightedCoins{
   public static int bestCombo(int maxWeight, WeightedObject[] objarr){
      int[][] arr = new int[maxWeight + 1][objarr.length];
      for(int i = 0; i < arr.length - 1; i++){
         for(int o = 0; o < arr[i].length - 1; o++){
            if(i > 0){
               if(o - objarr[o].getWeight() < 0){
                  System.out.println(i + " " + o);
                  arr[o][i] = 0;
               } else {
                  arr[o][i] = arr[o - objarr[o].getWeight()][i - 1];
               }
            } else {
               if(objarr[o].getWeight() < i){
                  arr[o][i] = objarr[o].getValue();
               }
            }
         }
      }
      return arr[arr[arr.length - 1].length][arr.length - 1];
   }
}