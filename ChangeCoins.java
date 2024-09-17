import java.util.*;
import java.io.*;

public class ChangeCoins{
   public static int howManyCoins(int amount, int[] arr){
      int coinAm = 0;
      for(int i = 0; i < arr.length; i++){
         if(amount >= arr[i]){
            amount -= arr[i];
            coinAm++;
            i--;
         }
      }
      return coinAm;
   }
   
   public static int howManyCoinsDyn(int amount, int[] arr){
      int[] amountArr = new int[amount + 1];
      Arrays.fill(amountArr, -1);
      amountArr[0] = 0;
      for(int i = 0; i < amountArr.length; i++){
         for(int o = 0; o < arr.length; o++){
            if(i - arr[o] >= 0){
               amountArr[i] = amountArr[i - arr[o]] + 1;
            }
         }
      }
      return amountArr[amount];
   }
}